# Questões para Reflexão - Padrão Decorator

### a) Qual problema existente no código inicial foi resolvido com o Decorator?
No código inicial, utilizava-se herança direta para cada combinação possível de bebida e ingrediente adicional (ex: `CoffeeWithMilk`, `CoffeeWithMilkAndChocolate`). Isso causava uma explosão de subclasses no sistema (um crescimento combinatório), duplicação de códigos para descrições e preços, e impossibilidade de adicionar ou repetir ingredientes dinamicamente em tempo de execução sem criar novas classes. O padrão Decorator resolveu isso permitindo envelopar objetos de bebidas com decoradores de adicionais de forma flexível e encadeada.

---

### b) Quais classes representam o componente, os componentes concretos, o decorador base e os decoradores concretos na sua implementação?
- **Componente (`Component`)**: A interface `Beverage`, que estabelece a abstração base com os métodos `getDescription()` e `getCost()`.
- **Componentes Concretos (`ConcreteComponents`)**: As classes `Coffee` e `Tea`, que representam as bebidas base fundamentais.
- **Decorador Base (`BaseDecorator`)**: A classe abstrata `BeverageDecorator`, que implementa `Beverage` e mantém uma referência encapsulada para o objeto envolvido (`Beverage beverage`).
- **Decoradores Concretos (`ConcreteDecorators`)**: As classes `MilkDecorator`, `ChocolateDecorator`, `WhippedCreamDecorator` e `CaramelDecorator`, que estendem `BeverageDecorator` para adicionar responsabilidades (descrição e preço) dinamicamente.

---

### c) Por que o decorador deve implementar a mesma abstração do objeto que ele envolve?
O decorador deve implementar a mesma interface/abstração (`Beverage`) para garantir a **transparência** e a **intercambiabilidade** de tipos. Como o decorador possui exatamente a mesma interface do componente decorado, o código cliente (e outros decoradores) pode tratar o objeto envelopado exatamente como se fosse o componente original. Isso permite o **aninhamento e encadeamento indeterminado de decoradores** (ex: `new MilkDecorator(new MilkDecorator(new Coffee()))`).

---

### d) Como a composição e a delegação permitem combinar adicionais sem criar uma subclasse para cada combinação?
Em vez de depender de herança estática definida em tempo de compilação, o Decorator utiliza **composição** (mantendo uma referência interna para o objeto envelopado) e **delegação** (repassando a chamada de `getDescription()` e `getCost()` para o objeto interno antes de somar seu próprio comportamento). Como os objetos são montados dinamicamente na memória via construtores encadeados em tempo de execução, é possível criar centenas de combinações diferentes de ingredientes reutilizando apenas um pequeno conjunto de classes de decoradores.

---

### e) Como a inclusão de um novo adicional se relaciona com o princípio Open/Closed (OCP)?
O padrão Decorator é uma demonstração direta do princípio **Open/Closed (Aberto para extensão, Fechado para modificação)**:
- **Aberto para extensão**: Para adicionar um novo ingrediente (como o `CaramelDecorator` do desafio adicional), basta criar uma nova classe decoradora que estenda `BeverageDecorator`.
- **Fechado para modificação**: Não é necessário alterar nenhuma linha de código das bebidas base existentes (`Coffee`, `Tea`) nem dos decoradores já criados (`MilkDecorator`, `ChocolateDecorator`, etc.). O novo ingrediente funciona imediatamente em conjunto com todas as bebidas e adicionais pré-existentes.
