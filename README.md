# Brewer - Venda De Cervejas

&nbsp;&nbsp;&nbsp;&nbsp;Brewer é um sistema online de vendas de cervejas responsivo para se adaptar a todos tipos de telas que tem como papel agilizar o processo de vendas de cerveja ou propondo ao cliente registrar um orçamento ou recebê-lo por e-mail para uma compra futura.


&nbsp;&nbsp;&nbsp;&nbsp;Este artigo descreve como o sistema foi projetado utilizando diagrama de classes para exibição da arquitetura do projeto e a modelagem de banco de dados para exibir os relacionamentos entre as tabelas do banco de dados, tecnologias utilizadas também como as funcionalidades do sistema e práticas de seguranças utilizadas.


### 1. Diagrama de Classe

&nbsp;&nbsp;&nbsp;&nbsp;A **figura 1** descreve a estrutura do sistema Brewer modelando suas classes descrevendo seus atributos e as relações entre objetos.

<img src="https://uploaddeimagens.com.br/images/001/193/625/original/diagrama-classe-brewer.png?1512062211" alt="Diagrama de classe" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 1.</b> 
  </p> 
</img>

### 2. Diagrama E-R - Modelo de banco de dados
&nbsp;&nbsp;&nbsp;&nbsp;A **figura 2** representa graficamente essas entidades e seus relacionamentos com as de mais entidades do banco de dados

<img src="https://uploaddeimagens.com.br/images/001/193/621/original/er.png?1512062123" alt="ER - Diagrama entidade relacionamento" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 2.</b> 
  </p> 
</img>

### 3. Tecnologias Utilizadas

 - **Java** - Linguagem de programação utilizada para o desenvolvimento do sistema.
 
 - **Spring Framework** - Frameworks responsável pela arquitetura MVC e seguranças com **BCrypt** no projeto. 

 - **Thymeleaf** - Template engine do projeto responsável por transmitir dados para tela, construção de layout das telas.
 
 - **JPA/Hibernate** - Utilizada a especificação do **JPA**  para persistência dos dados utilizando a implementação do **Hibernate**.
 
 - **HTML 5 e CSS3** - Usada para codificação e estilização do projeto utilizando também a biblioteca CSS do **Bootstrap**.
 
 - **Javascript** - Usada para interatividade com o usuário e controles dos dados do sistema.

 - **Maven** - Para arquitetura inicial de projeto e controle de dependências.

 - **Flyway** Para a utilização de banco de dados incremental.
 
 - **MySql** - Linguagem de banco de dados utilizada banco de dados.

 - **SLF4 e Log4j** Para controle dos log da aplicação.

 - **Bean Validation e Hibernate Validator** - Usado validação de entidades e validações de campos.

 - **Thumbnailator** - Para criação de thumbmail das imagens da cervejas.

 - **JUnit** - Para teste unitários.

 - **Java Mail** - Responsável pelos envio de e-mail utilizando serviço do **sendgrid**.

 - **ChartJS** - Para geração de gráficos.
 
 - **JasperReport** - Para geração de relatórios do sistema.

 - **JasperReport** - Para geração de relatórios.
