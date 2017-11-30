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
&nbsp;&nbsp;&nbsp;&nbsp;A seguir serão listadas todas as tecnologias utilizadas no desenvolvimento do sistema Brewer

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

### 4. Interface do sistema
&nbsp;&nbsp;&nbsp;&nbsp;Nesse tópico serão mostradas as principais telas do sistemas seguindo de suas funcionalidades.
 
#### 4.1.1 Login
&nbsp;&nbsp;&nbsp;&nbsp;Inicialmente o sistema inicia na tela de “login” onde o vendedor irá entrar com seus dados de autenticação, como mostrado na **figura 3**.

<img src="https://uploaddeimagens.com.br/images/001/193/663/original/login.png?1512063577" alt="Tela de login" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 3.</b> 
  </p> 
</img>

#### 4.1.2 Erro ao logar
&nbsp;&nbsp;&nbsp;&nbsp;Na figura 4. é mostrado a mensagem de falha ao tentar logar caso o vendedor informe seus dados incorretamente.

<img src="https://uploaddeimagens.com.br/images/001/193/666/original/erroLogin.png?1512063670" alt="Mensagem de falha ao tentar logar" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 4.</b> 
  </p> 
</img>

#### 4.2 Tela Inicial
&nbsp;&nbsp;&nbsp;&nbsp;A tela inicial do sistema é composta por um cabeçalho contendo a logo do sistema Brewer, nome do vendedor e o botão de sair (logout) mais abaixo temos o menu lateral com os menus do sistema (ver próximo tópico) e a área de conteúdo que exibe a página de “Dashboard” do sistema e por fim o rodapé no final da página contendo o nome do desenvolvedor do sistema. **Figura 5**.

<img src="https://uploaddeimagens.com.br/images/001/193/680/original/dashboard.png?1512064130" alt="Dashboard - Tela inicial do sistema" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 5.</b> 
  </p> 
</img>

#### 5.3 Menu Lateral
&nbsp;&nbsp;&nbsp;&nbsp;No menu lateral temos 5 menus e seus submenus.
- Dashboard
- Vendas
    - Cadastro de venda
    - Pesquisa de vendas
- Estoque
    - Estilo
    - Cervejas
- Cadastro
    - Cidades
    - Clientes
    - Usuários
- Relatórios
    - Vendas emitidas
#### 5.3.1 Dashboard
&nbsp;&nbsp;&nbsp;&nbsp;A tela de “Dashboard” serão feitas o levantamento de algumas informações como “Valor do estoque”, “Itens no estoque”, “Total de clientes”, “Vendas no ano”, “Vendas no mês”, “Ticket médio” assim como dois gráficos, um mostrando a quantidades de vendas nos últimos 6 meses e o outro a quantidade de cervejas “Nacional” e “Internacional”. Como mostrado na **figura 5**.

#### 5.3.2 Vendas
&nbsp;&nbsp;&nbsp;&nbsp;O menu de vendas possui dois submenus “Cadastro de venda” e “Pesquisa de vendas”.

#### 5.3.2.1 Cadastro de venda
No cadastro de venda encontra-se 3 caixas de informações “Total”, “Status” e “Criação” representando o valor total da compra, o status da compra se está em “Orçamento”, “Emitida” ou “Cancelada”. e a data de criação da compra. Abaixo temos o formulário da venda com os campos de pesquisa rápida de “Cliente”, entrada de “Valor do frete”, entrada de “Valor do desconto” e duas abas terminando o formulário. Mostrado na **figura 6**. 

<img src="https://uploaddeimagens.com.br/images/001/193/700/original/CadastroVenda.png?1512065012" alt="Tela de cadastro de venda" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 6.</b> 
  </p> 
</img>

&nbsp;&nbsp;&nbsp;&nbsp;Na aba “Cervejas” temos um campo de pesquisa rápida de cerveja onde ao digitar o “Nome” ou “SKU” aparecerá uma caixa de seleção contendo o nome da cerveja, SKU, origem da cerveja e o valor seu unitário. Após selecionar a cerveja ela aparecerá na tabela de itens da venda logo abaixo do campo de pesquisa rápida de “Cliente”. **Figura 7**.

<img src="https://uploaddeimagens.com.br/images/001/193/701/original/VendaPreenchida.png?1512065067" alt="Tela de cadastro de venda preenchida" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 7.</b> 
  </p> 
</img>

&nbsp;&nbsp;&nbsp;&nbsp;Na Aba de entrega encontra-se outro formulário com os campos “Data de entrega”, “Horário de entrega” e “Observação” exibida na **figura 8**.

<img src="https://uploaddeimagens.com.br/images/001/193/713/original/VendaEntrada.png?1512065478" alt="Tela de cadastro de venda - Guia entrada" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 8.</b> 
  </p> 
</img>


