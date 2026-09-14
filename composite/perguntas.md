# Questões para Reflexão - Padrão Composite

### a) Qual problema existente no código inicial foi resolvido com o Composite?
No código inicial, a classe `Folder` aceitava apenas instâncias diretas de `DocumentFile`. Isso impedia a criação de estruturas de diretórios aninhadas (pastas contendo outras pastas). Caso tentássemos suportar subpastas sem o padrão Composite, seria necessário manter listas separadas para arquivos e pastas e tratar cada tipo de elemento com lógicas condicionais distintas. O padrão Composite resolveu esse problema permitindo compor objetos em estruturas de árvore e tratar objetos individuais (folhas) e composições de objetos (compostos) de maneira totalmente uniforme.

---

### b) Quais elementos representam o componente, a folha e o composto na sua implementação?
- **Componente (`Component`)**: A interface `FileSystemComponent`, que estabelece a abstração e o contrato comum para todos os elementos da hierarquia (`getName()`, `getSize()`, `display()`).
- **Folha (`Leaf`)**: A classe `DocumentFile`, que representa o elemento terminal da árvore (não possui filhos e possui tamanho próprio).
- **Composto (`Composite`)**: A classe `Folder`, que representa o contêiner composto por um grupo de elementos do tipo `FileSystemComponent`, podendo armazenar arquivos e subpastas.

---

### c) Como o polimorfismo permite tratar arquivos e pastas de maneira uniforme?
Através do uso da interface comum `FileSystemComponent`. O código cliente (como a classe `Main` ou o método de navegação da própria `Folder`) invoca operações sobre a abstração sem precisar saber a classe concreta do elemento. O Java resolve a chamada via despacho dinâmico em tempo de execução:
- Se for um `DocumentFile`, retorna o seu próprio tamanho ou imprime o seu nome.
- Se for uma `Folder`, itera sobre seus filhos executando o mesmo método.
Isso elimina por completo a necessidade de estruturas condicionais (`if/else`) ou verificações explícitas do tipo com `instanceof`.

---

### d) Qual é o papel da recursão no cálculo do tamanho das pastas?
O método `getSize()` da classe `Folder` itera sobre sua lista de elementos `FileSystemComponent`. Caso um desses elementos seja uma subpasta, a chamada ao método `getSize()` aciona recursivamente o cálculo dessa subpasta (e de todas as suas futuras subpastas filhas). A recursão desce a árvore até atingir as folhas (`DocumentFile`), que retornam seus valores base, permitindo calcular o tamanho total acumulado de qualquer nível da hierarquia de forma elegante e transparente.

---

### e) Quais são as vantagens e limitações de manter as operações de adicionar e remover filhos apenas na classe Folder?
- **Vantagens (Abordagem de Segurança)**: Como arquivos individuais (`DocumentFile`) não possuem filhos, não faz sentido expor métodos como `add()` e `remove()` para eles. Manter essas operações exclusivamente na classe `Folder` previne erros em tempo de compilação, impedindo que o desenvolvedor tente adicionar um componente dentro de um arquivo folha por engano.
- **Limitações (Perda de Transparência)**: O cliente precisa ter conhecimento de que um determinado componente é especificamente uma `Folder` caso necessite modificar sua estrutura interna (adicionar/remover filhos), perdendo um pouco da transparência de tratar todos os componentes estritamente pela interface genérica `FileSystemComponent`.
