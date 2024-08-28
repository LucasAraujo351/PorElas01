
# PorElas

Este projeto de software visa fornecer suporte integral a mulheres em situação de vulnerabilidade, com foco especial nas que enfrentam desafios relacionados à maternidade.
O objetivo é abordar questões cruciais como saúde durante a gravidez, acesso a direitos — auxílio, maternidade e pensão —, além de oferecer informações jurídicas e apoio emocional.
A plataforma pretende resolver a carência de informações e suporte para mulheres grávidas, garantindo acesso a referências essenciais para uma gestação segura e digna, enquanto promove
a inclusão e o empoderamento dessas mulheres.

### Por quê decidimos fazer esse projeto? 
O projeto PorElas surgiu para abordar uma necessidade crítica: a ausência de suporte adequado para mulheres em situação de vulnerabilidade, especialme
nte durante o período gestacional. Identificamos que muitas mulheres enfrentam dificuldades devido à falta de informações claras sobre direitos trabalhistas,
cuidados de saúde e explicitação jurídica, deixando-as desamparadas em momentos decisivos. Nosso objetivo é preencher esse lapso com uma plataforma que centraliza mecanismo essenciais,
garantindo que essas mulheres tenham acesso ao apoio necessário para uma gestação segura e digna, além de capacita-las para conhecer e reivindicar seus direitos.


### Quais foram os desafios de implementá-lo?
Complexidade Jurídica e Diversidade de Leis: Criar uma plataforma com informações jurídicas confiáveis demandou um conhecimento profundo das leis trabalhistas e direitos das mulheres. 
Adaptar essas informações para torná-las acessíveis e úteis para diversas situações representou um desafio significativo.


#### Design e Usabilidade: 
Desenvolver uma interface que fosse intuitiva e acolhedora para o público-alvo exigiu um equilíbrio cuidadoso entre funcionalidade e estética. 
Foi essencial garantir que a plataforma fosse de fácil navegação, especialmente para usuárias com pouca familiaridade com tecnologia.


#### Segurança da Informação: 
Proteger os dados sensíveis das usuárias, como informações pessoais, foi um dos maiores desafios. 
Implementar medidas de segurança robustas, e segura, foi crucial para garantir a confidencialidade e integridade das informações.

#### Escalabilidade e Sustentabilidade:
Planejar o crescimento da plataforma para atender um número crescente de usuárias e garantir a continuidade dos recursos de suporte a longo prazo foi um desafio estratégico.
Assegurar que a escalabilidade do sistema não comprometesse a qualidade do serviço foi fundamental.



####  Empatia e Compreensão do Público-Alvo:
Desenvolver um produto que realmente atenda às necessidades das usuárias demandou uma compreensão profunda de suas realidades e desafios. 
Isso envolveu pesquisas detalhadas, entrevistas e uma contínua adaptação do projeto para assegurar que ele fosse relevante e impactante.


#### O que aprendemos desenvolvendo o PorElas?
Importância da Empatia no Desenvolvimento de Soluções Para a Problematica: Aprendemos que se colocar no lugar do usuário final é crucial para criar soluções verdadeiramente eficazes. 
Ouvir atentamente as necessidades e desafios das mulheres que a plataforma busca apoiar foi essencial para moldar o produto de maneira relevante e sensível.


#### Interdisciplinaridade como Chave para o Sucesso:
A integração de conhecimentos em direito, tecnologia, design e saúde revelou-se essencial.
Aprendemos que projetos complexos exigem uma abordagem multidisciplinar, na qual diferentes expertises se combinam para criar uma solução coesa e funcional.

#### Resiliência Diante de Desafios: 
A implementação enfrentou inúmeros desafios, desde questões técnicas até a complexidade jurídica. Aprendemos que a resiliência e 
a capacidade de adaptar estratégias diante de obstáculos são vitais para o progresso e sucesso de qualquer projeto.

#### Importância da Segurança da Informação: 
Proteger os dados das usuárias foi um aprendizado crucial.
Compreendemos que a confiança das usuárias na plataforma depende diretamente da segurança com que suas informações são tratadas,
o que reforçou a importância de priorizar medidas de segurança desde o início.

#### O Valor da Iteração Contínua:
O projeto ensinou que o desenvolvimento de software é um processo contínuo de aprendizado e melhoria. 
Testar, receber feedback e iterar foram passos fundamentais para aprimorar a plataform a e garantir que ela atendesse às necessidades das usuárias de maneira eficaz.

#### Impacto Social como Motivador:
Descobrimos que trabalhar em um projeto com propósito social aumenta significativamente o engajamento e a motivação da equipe. 
Saber que o trabalho realizado pode gerar uma diferença autêntica na vida de pessoas em situação de vulnerabilidade fortaleceu o compromisso e a atribuição de todos os envolvidos.

Essas lições não apenas enriqueceram o desenvolvimento do PorElas, mas também proporcionaram experiências e conhecimentos valiosos que terão um impacto duradouro e serão aplicados em nossos futuros projetos.

### Conteúdos
+ Arquitetura
+ Features
+ Intruções de Execução


#### Arquitetura
Optamos por usar arquitetura baseada em camadas para criar aplicações de software bem organizadas, separando as responsabilidades em diferentes camadas.
![Captura de tela 2024-08-28 150737](https://github.com/user-attachments/assets/8736139f-3da5-4850-9745-f3adfbdf222a)



* [HTML,CSS, JavaScript](https://educafrotech.educafro.org.br/documents/html-css-javascript.pdf)
* [Angular](https://angular.dev/)
* [JAVA](https://www.oracle.com/br/java/)
* [SpringBoot](https://spring.io/projects/spring-boot)
* [MySQL](https://www.mysql.com/)
* [Postaman](https://www.postman.com/)

#### Frontend (Angular,HTML,CSS e JavaScript )
Função: A interface do usuário, desenvolvida usando HTML, CSS e JavaScript, onde os usuários interagem diretamente com o sistema. Componentes: 
Inclui páginas web e formulários que permitem o acesso a diversas funcionalidades do sistema.

#### Backend (Java & Spring)
Função: O núcleo do sistema que processa as solicitações dos usuários, aplica a lógica de negócio, e interage com o banco de dados. Framework: Desenvolvido em Java utilizando o framework Spring e dependência Maven que facilita a criação de APIs, 
controle de dependências, e segurança. APIs: O Backend expõe várias APIs que permitem a comunicação entre o Frontend e o Banco de Dados.

#### Banco de Dados( )
Função: Armazena os dados do sistema, como informações de usuários, transações, registros, e qualquer outro dado necessário. Interação:
O Backend é o único componente que interage diretamente com o Banco de Dados, realizando operações de leitura e escrita para processar as solicitações dos usuários.

#### Fluxo de Dados
O Frontend envia solicitações para o Backend através das APIs.
O Backend processa essas solicitações, possivelmente consultando ou atualizando o Banco de Dados.
As respostas são então enviadas de volta ao Frontend, que as exibe para o usuário.

![Captura de tela 2024-08-28 164056](https://github.com/user-attachments/assets/2bf1d6df-d818-43f5-a88c-c2ca1a3ef101)



##### Features

*Tela de Login:* Oferece campos para acesso ao sistema e recuperação de senha.

*Navegação e Menu:* Permite acesso fácil às diferentes seções do site.

*Recuperação de Senha:* Facilita a recuperação e redefinição de senha via email.

*Página de Capacitação:* Lista cursos e materiais de treinamento disponíveis.

*Loja:* Exibe produtos e serviços para compra e gerencia o processo de checkout.

*Perfil do Usuário:* Mostra e permite a edição de informações pessoais e configurações.


+ Intruções de Execução
+ Pré-Requesitos
  
Antes de instalar as dependências, certifique-se de que você tenha o seguinte instalado no seu ambiente de desenvolvimento:


##### Java Development Kit (JDK):
A versão recomendada é a JDK 17 ou superior.

##### Maven: 
Para gerenciar as dependências e automatizar o processo de build.

##### Git:
Para clonar o repositório do projeto, se necessário.

##### IDE (Eclipse e VS Code):
Embora opcional, usar uma IDE pode facilitar o processo de desenvolvimento e execução do projeto.

##### Clonar o Repositório do Projeto:
Se o código do projeto estiver em um repositório Git, você pode cloná-lo usando o seguinte comando

![Captura de tela 2024-08-28 155925](https://github.com/user-attachments/assets/73f38182-0661-4337-8715-e5f6577cf862)


#### Instalação das Dependências
Se você está utilizando o Spring para gerenciamento de dependências, o Maven cuidará disso automaticamente. No diretório raiz do projeto, execute o seguinte comando:

![Captura de tela 2024-08-28 160351](https://github.com/user-attachments/assets/aae75d3e-559b-4fba-9c6a-ee9e88945598)

obs.: O comando muda de a cordo com a linguagem escolhida, no nosso caso foi MAVEN(Java).
Esse comando vai baixar todas as dependências necessárias que estão listadas no arquivo pom.xml e compilar o projeto.

#### Configuração do Banco de Dados
Verifique o arquivo 'application.properties' ou 'application.yml' na pasta 'src/main/resources/' para garantir que as configurações de banco de dados estão corretas:

![image](https://github.com/user-attachments/assets/499f9f61-9a71-42dc-b000-1bf260c354e8)

+ Substitua jdbc:mysql://localhost:3306/nome_do_banco pela URL do seu banco de dados.
+ Substitua seu_usuario e sua_senha pelas credenciais do seu banco de dados.
+ Verifique se o driver JDBC para o banco de dados que você está usando está incluído nas dependências do seu projeto.
  
Essas configurações são para um banco de dados MySQL; se você estiver usando outro tipo de banco de dados, como PostgreSQL ou Oracle,
 as propriedades do driver e o dialecto do Hibernate podem precisar ser ajustados.

#### Executar a Aplicação
Para executar a aplicação Spring Boot, você pode usar o Maven diretamente ou executar o arquivo gerado:
![Captura de tela 2024-08-28 161251](https://github.com/user-attachments/assets/3a7e1e78-4c03-4e68-8443-9728b7b203b5)

Ou, se o projeto gerar um arquivo .jar, você pode executá-lo diretamente:
![Captura de tela 2024-08-28 161405](https://github.com/user-attachments/assets/4ff9af5e-c576-4517-b9e0-98510d7ff5dc)

#### Acessar a Aplicação
Uma vez que a aplicação estiver em execução, você pode acessá-la no navegador, normalmente em 'http://localhost:8080'.




