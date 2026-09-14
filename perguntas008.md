a) Qual problema existente na integração com o serviço externo foi resolvido com o Adapter?
Foi resolvida a incompatibilidade de interfaces entre a classe cliente (OrderService) e o serviço de terceiros (ExternalPaymentGateway). O OrderService esperava um método simples pay(double amount), enquanto o serviço externo exigia a assinatura makePayment(String currency, double value). O Adapter fez a ponte e a tradução entre ambos os lados sem forçar alterações nas classes existentes.

b) Qual classe representa o Adapter na sua implementação?
A classe ExternalPaymentAdapter. Ela implementa a interface esperada pelo sistema (PaymentProcessor) e mantém uma referência para a classe adaptada (ExternalPaymentGateway).

c) Qual é a diferença entre a interface esperada pelo sistema e a interface fornecida pelo serviço externo?
Interface esperada (PaymentProcessor): Aceita apenas o parâmetro pay(double amount).
Interface fornecida (ExternalPaymentGateway): Requer dois parâmetros obrigatórios: makePayment(String currency, double value).
d) Por que não é recomendado alterar diretamente a classe ExternalPaymentGateway?
Código de Terceiros: Em cenários reais, classes externas fazem parte de bibliotecas/JARs pré-compilados aos quais não temos acesso ao código-fonte.
Princípio Aberto/Fechado (OCP): Alterar classes externas ou existentes pode quebrar outras partes de aplicações que já dependem do comportamento original e complica atualizações futuras dessa biblioteca.
e) Em quais situações o padrão Adapter é mais indicado do que modificar todas as classes clientes?
Quando se deseja integrar bibliotecas de terceiros ou componentes legados que possuem interfaces incompatíveis.
Quando a mudança nas classes clientes espalharia detalhes de integração e parâmetros específicos por todo o sistema (como o parâmetro de moeda).
Quando se busca manter o sistema desacoplado, permitindo trocar ou adicionar novos provedores de serviço (gateways) apenas criando novos adaptadores, sem impactar a regra de negócio do cliente.