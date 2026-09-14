a) Qual problema existente no código inicial foi resolvido com o Bridge?
Foi resolvida a explosão combinatória de classes resultante do acoplamento direto entre as dimensões de 
variação: tipo de notificação e canal de envio. No modelo original com herança rígida, a adição de novos 
tipos e canais gerava um crescimento multiplicativo de classes ( N×M), além de duplicação de código.

b) O que representa a abstração na sua implementação?
A classe abstrata Notification e suas subclasses (AlertNotification, ReminderNotification, WarningNotification). 
Elas representam as regras de negócio de alto nível do domínio de notificações.

c) O que representa a implementação na sua solução?
A interface NotificationSender e suas implementações concretas (EmailSender, SmsSender, WhatsAppSender). Elas 
representam a infraestrutura/plataforma de baixo nível responsável pelo transporte técnico das mensagens.

d) Qual é a diferença entre utilizar Bridge e criar uma classe para cada combinação possível?
Sem Bridge (Classes por combinação): Crescimento multiplicativo (N×M). Para 3 tipos e 3 canais, exigiriam-se 9 classes 
concretas duplicadas. Com Bridge (Composição): Crescimento aditivo (N+M). Para os mesmos 3 tipos e 3 canais, criamos 
apenas 3+3=6 classes independentes. As combinações ocorrem dinamicamente em tempo de execução via injeção de 
dependência.

e) Em quais situações o padrão Bridge é mais indicado?
Quando um sistema possui duas ou mais dimensões de variação independentes (ex: Abstração e Implementação, Sistema 
Operacional e Interface de Usuário, Tipo de Relatório e Formato de Saída).
Quando deseja-se evitar uma estrutura com herança acoplada e proliferação desordenada de subclasses.
Quando se quer permitir que a lógica de negócio (Abstração) e a infraestrutura (Implementação) evoluam e sejam 
estendidas em hierarquias de classes totalmente separadas sem afetar uma à outra.