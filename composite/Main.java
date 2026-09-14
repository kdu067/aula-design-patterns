public class Main {

    public static void main(String[] args) {
        System.out.println("=== 1. Arquivo Isolado ===");
        FileSystemComponent singleFile = new DocumentFile("document.pdf", 350);
        System.out.println("Nome: " + singleFile.getName() + " | Tamanho: " + singleFile.getSize() + " KB");
        singleFile.display("");

        System.out.println("\n=== 2. Pasta Vazia ===");
        FileSystemComponent emptyFolder = new Folder("EmptyFolder");
        System.out.println("Nome: " + emptyFolder.getName() + " | Tamanho: " + emptyFolder.getSize() + " KB");
        emptyFolder.display("");

        System.out.println("\n=== 3. Hierarquia com Multiplos Niveis de Subpastas ===");
        // Raiz (Nivel 0)
        Folder rootFolder = new Folder("Root");

        // Arquivos na Raiz
        rootFolder.add(new DocumentFile("readme.txt", 10));
        rootFolder.add(new DocumentFile("license.md", 5));

        // Subpasta 1 (Nivel 1)
        Folder documentsFolder = new Folder("Documents");
        documentsFolder.add(new DocumentFile("report_2026.pdf", 1200));
        documentsFolder.add(new DocumentFile("budget.xlsx", 800));

        // Subpasta 2 (Nivel 1)
        Folder picturesFolder = new Folder("Pictures");
        picturesFolder.add(new DocumentFile("vacation.png", 3500));

        // Sub-subpasta (Nivel 2 dentro de Pictures)
        Folder familyAlbum = new Folder("Family_2025");
        familyAlbum.add(new DocumentFile("photo1.jpg", 2100));
        familyAlbum.add(new DocumentFile("photo2.jpg", 1900));

        picturesFolder.add(familyAlbum); // Adiciona sub-subpasta em Pictures

        // Adiciona as subpastas no Root
        rootFolder.add(documentsFolder);
        rootFolder.add(picturesFolder);

        // Exibicao uniforme usando a abstracao FileSystemComponent
        System.out.println("Tamanho total do diretorio raiz: " + rootFolder.getSize() + " KB\n");
        System.out.println("--- Estrutura Completa da Arvore ---");
        rootFolder.display("");
    }
}
