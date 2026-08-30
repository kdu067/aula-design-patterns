import java.util.ArrayList;
import java.util.List;

public class Character implements CharacterPrototype {

    private String name;
    private String type;
    private int health;
    private int attack;
    private int defense;
    private String weapon;
    private List<String> skills;

    public Character(String name, String type, int health, int attack, int defense, String weapon, List<String> skills) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.weapon = weapon;
        this.skills = skills != null ? new ArrayList<>(skills) : new ArrayList<>();
    }

    // Construtor de cópia para realizar a Cópia Profunda (Deep Copy)
    public Character(Character target) {
        if (target != null) {
            this.name = target.name;
            this.type = target.type;
            this.health = target.health;
            this.attack = target.attack;
            this.defense = target.defense;
            this.weapon = target.weapon;
            // Cópia profunda da lista de habilidades (nova referência na memória)
            this.skills = new ArrayList<>(target.skills);
        }
    }

    @Override
    public Character clone() {
        return new Character(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void removeSkill(String skill) {
        this.skills.remove(skill);
    }

    @Override
    public String toString() {
        return """
                --------------------------
                Personagem: %s
                Tipo: %s
                Vida: %d | Ataque: %d | Defesa: %d
                Arma: %s
                Habilidades: %s
                --------------------------""".formatted(
                name, type, health, attack, defense, weapon, skills
        );
    }
}
