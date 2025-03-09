# Controle-de-Fila-de-Espera

Sistema de Fila de Espera para Pizzaria com Notificação via WhatsApp
Este projeto implementa um sistema simples de Fila de Espera para uma pizzaria, permitindo que os clientes sejam cadastrados e, quando uma vaga estiver disponível, sejam notificados via WhatsApp. O sistema foi desenvolvido em Java e utiliza a API da Twilio para o envio das mensagens.

Funcionalidades
Cadastro de clientes: O sistema permite o cadastro de clientes com nome e telefone.
Fila de Espera: Os clientes são adicionados a uma fila e exibidos no sistema.
Notificação via WhatsApp: Quando uma vaga na pizzaria se torna disponível, uma mensagem é enviada automaticamente para o cliente avisando sobre a disponibilidade da vaga.
Tecnologias
Java: Linguagem de programação principal utilizada para o desenvolvimento do sistema.
Twilio API: API utilizada para o envio de mensagens via WhatsApp.
SLF4J: Biblioteca para logging, que é usada internamente pela Twilio (pode gerar mensagens de erro relacionadas ao logging durante os testes).
Como Rodar o Projeto
Pré-requisitos
Antes de rodar o projeto, é necessário:

Ter uma conta no Twilio.
Configurar a Sandbox do WhatsApp no Twilio para poder testar o envio de mensagens.
Obter o ACCOUNT SID e o AUTH TOKEN no Twilio (que você usará para configurar o sistema).
Passos
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/SeuUsuario/fila-de-espera-pizzaria.git
Importe o projeto em sua IDE preferida (por exemplo, IntelliJ IDEA).

Configuração do Twilio:

Registre seu número de WhatsApp na Twilio Sandbox.
Obtenha seu ACCOUNT SID e AUTH TOKEN no painel do Twilio.
Coloque essas credenciais no código em NotificadorWhatsApp.java nas constantes ACCOUNT_SID e AUTH_TOKEN.

Compilação e Execução:

Certifique-se de que o Twilio SDK está no classpath. Caso contrário, adicione o arquivo JAR manualmente ou use Maven/Gradle se estiver usando uma dessas ferramentas.
Execute a classe Main.java, onde o sistema pede o nome e o telefone do cliente.
Quando uma vaga ficar disponível, o sistema enviará a notificação para o cliente via WhatsApp.
Testes
O sistema foi desenvolvido e testado usando a Twilio Sandbox. Para testar o envio de mensagens, adicione seu número de WhatsApp à sandbox do Twilio e execute o sistema.

Exemplo de Saída
Durante a execução, quando um cliente for adicionado à fila e uma vaga for liberada, você verá a seguinte saída no console:

java
Copiar
Editar
Qual o nome do cliente?
Amanda Closs
Qual o telefone do cliente?
19987654321
Amanda Closs adicionado com sucesso à fila de espera!
Clientes na fila de espera:
- Amanda Closs (19987654321)

A vaga ficou disponível. Enviando mensagem...
Mensagem enviada com SID: SMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
