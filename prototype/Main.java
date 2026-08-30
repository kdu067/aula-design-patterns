import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CRIAÇÃO DE PERSONAGENS (PADRÃO PROTOTYPE) ===\n");

        // 1. Inicializando o catálogo/registro de protótipos
        CharacterRegistry registry = new CharacterRegistry();

        // 2. Clonando e customizando protótipos
        System.out.println("--- Criando Guerreiros a partir do protótipo Warrior ---");
        Character warrior1 = registry.getPrototype("warrior");
        warrior1.setName("Arthos");
        warrior1.setWeapon("Espada Longa de Aço");

        Character warrior2 = registry.getPrototype("warrior");
        warrior2.setName("Brakus");
        warrior2.setWeapon("Machado de Guerra Duplo");

        System.out.println(warrior1);
        System.out.println(warrior2);

        // 3. Clonando e customizando protótipo de Mago (com alteração de habilidades)
        System.out.println("\n--- Criando Mago a partir do protótipo Mage ---");
        Character mage1 = registry.getPrototype("mage");
        mage1.setName("Merlin");
        mage1.setWeapon("Cajado Elemental");

        // 4. Clonando e customizando protótipo de Arqueiro
        System.out.println("\n--- Criando Arqueiro a partir do protótipo Archer ---");
        Character archer1 = registry.getPrototype("archer");
        archer1.setName("Robin Hood");
        archer1.setWeapon("Arco Recurvo Épico");

        System.out.println(mage1);
        System.out.println(archer1);

        // 5. Demonstração do Desafio Adicional: Cópia Profunda (Deep Copy)
        System.out.println("\n=== DEMONSTRAÇÃO DE CÓPIA PROFUNDA (DEEP COPY) NAS HABILIDADES ===");
        
        System.out.println("\nAdicionando a habilidade 'Teleporte' ao clone Merlin...");
        mage1.addSkill("Teleporte");

        System.out.println("\n[Clone - Merlin] Habilidades atualizadas:");
        System.out.println(mage1.getSkills());

        System.out.println("\n[Protótipo Original - Mage Base] Habilidades mantidas (Intactas):");
        Character originalMage = registry.getPrototype("mage");
        System.out.println(originalMage.getSkills());

        if (!originalMage.getSkills().contains("Teleporte")) {
            System.out.println("\nSUCESSO: A alteração no clone NÃO afetou o protótipo original!");
            System.out.println("Isso comprova que a implementação utiliza CÓPIA PROFUNDA (Deep Copy).");
        } else {
            System.out.println("\nERRO: A alteração afetou o protótipo (Cópia Rasa).");
        }
    }
}
