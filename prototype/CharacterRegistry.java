import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {

    private final Map<String, Character> prototypes = new HashMap<>();

    public CharacterRegistry() {
        loadPrototypes();
    }

    private void loadPrototypes() {
        // Protótipo base para Warrior
        Character warriorPrototype = new Character(
                "Warrior Base",
                "Warrior",
                100,
                30,
                20,
                "Sword",
                java.util.List.of("Golpe Pesado", "Escudo Protetor")
        );

        // Protótipo base para Mage
        Character magePrototype = new Character(
                "Mage Base",
                "Mage",
                70,
                45,
                10,
                "Staff",
                java.util.List.of("Bola de Fogo", "Barreira Arcana")
        );

        // Protótipo base para Archer
        Character archerPrototype = new Character(
                "Archer Base",
                "Archer",
                80,
                35,
                15,
                "Bow",
                java.util.List.of("Tiro Certeiro", "Chuva de Flechas")
        );

        prototypes.put("warrior", warriorPrototype);
        prototypes.put("mage", magePrototype);
        prototypes.put("archer", archerPrototype);
    }

    public void addPrototype(String key, Character prototype) {
        prototypes.put(key, prototype);
    }

    public Character getPrototype(String key) {
        Character prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("Protótipo não encontrado para a chave: " + key);
    }
}
