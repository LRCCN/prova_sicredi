## Teste Técnico

Esse é um repositório que contém o Desafio 1 e 2 sobre automação web.

## Tecnologias Utilizadas

-   Java  [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
-   JUnit  [https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.8.2](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.8.2)
-   Maven  [https://maven.apache.org/](https://maven.apache.org/)

## Testes Automatizados

Desafio 1:

1. Acessar a página https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap
   1.1. Mudar o valor da combo Select version para “Bootstrap V4 Theme”
   1.2. Clicar no botão Add Customer
   1.3. Preencher os campos do formulário com as seguintes informações:
- Name: Teste Sicredi
- Last name: Teste
- ContactFirstName: seu nome
- Phone: 51 9999-9999
- AddressLine1: Av Assis Brasil, 3970
- AddressLine2: Torre D
- City: Porto Alegre
- State: RS
- PostalCode: 91000-000
- Country: Brasil
- from Employeer: Fixter
- CreditLimit: 200

2. Clicar no botão Save

3. Validar a mensagem “Your data has been successfully stored into the database. Edit Customer or Go back to list” através de uma asserção

4. Fechar o browser

Desafio 2:
2.1 Clicar no link Go back to list
2.2 Clicar na coluna “Search Name” e digitar o conteúdo do Name (Teste Sicredi)
2.3 Clicar no checkbox abaixo da palavra Actions
2.4 Clicar no botão Delete
2.5 Validar o texto “Are you sure that you want to delete this 1 item?” através de uma asserção para a popup que será apresentada
2.6 Clicar no botão Delete da popup, aparecerá uma mensagem dentro de um box verde na parte superior direito da tela. Adicione uma asserção na mensagem “Your data has been successfully deleted from the database.”
2.7 Fechar o browser