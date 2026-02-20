# Spring Boot E-commerce API
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/vitorfcgomes/project-springboot/blob/main/LICENSE)

# Sobre o projeto
API REST para gerenciamento de e-commerce desenvolvida com Spring Boot.

O sistema permite gerenciamento de usuários, pedidos, produtos e categorias,
incluindo relacionamento entre entidades (one-to-many, many-to-many e one-to-one),
tratamento de exceções personalizado e configuração de múltiplos perfis de ambiente.

Arquitetura baseada em camadas (Controller, Service, Repository),
utilizando Spring Data JPA para persistência e banco relacional para armazenamento.
Projeto estruturado visando boas práticas, organização e escalabilidade.
## 🚀 Tecnologias e Stacks Utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

### 🧠 Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate

### 🗄 Banco de Dados
- H2 Database (ambiente de teste)
- SQL

### 🌐 API & Testes
- RESTful API
- Postman

### ⚙️ Ferramentas e Build
- Maven
- Git & GitHub
- IntelliJ IDEA (ou IDE utilizada)

---

### 📌 Principais Conceitos Aplicados

- Arquitetura em camadas (Resource, Service, Repository)
- Injeção de Dependência
- Mapeamento Objeto-Relacional (ORM)
- Relacionamentos:
  - One-to-Many
  - Many-to-Many
  - One-to-One
- Chave primária composta
- Tratamento global de exceções
- Padrão REST

---

Este projeto foi desenvolvido com foco em boas práticas,
organização de código e separação de responsabilidades.

## 🏗 Estrutura do Projeto
O projeto está organizado seguindo arquitetura em camadas,
separando responsabilidades para manter organização,
manutenibilidade e escalabilidade.

📂 packages:

- resources → Camada responsável por expor os endpoints REST.
  Recebe as requisições HTTP e retorna respostas no formato JSON.

- services → Contém a lógica de negócio da aplicação.
  Realiza validações e coordena as operações entre controller e repository.

- repositories → Responsável pelo acesso ao banco de dados,
  utilizando Spring Data JPA.

- entities → Representa o modelo de domínio do sistema.
  Cada classe corresponde a uma tabela no banco de dados.

- entities.enums → Contém enums utilizados pelas entidades,
  como status de pedido.

- entities.pk → Classes responsáveis por chaves primárias compostas.

- services.exceptions → Exceções personalizadas da camada de serviço.

- resources.exceptions → Tratamento global de exceções,
  padronizando respostas de erro da API.

- config → Configurações da aplicação e classe de seeding
  para popular o banco de dados em ambiente de teste./

## 🗂 Modelo de Domínio
O sistema foi modelado com base em um domínio de e-commerce,
envolvendo usuários, pedidos, produtos, categorias e pagamentos.

O modelo contempla relacionamentos:
- One-to-Many
- Many-to-Many
- One-to-One
- Chave composta para itens de pedido
  
<p align="center">
  <img src="assets/Captura de tela 2026-02-20 150313.png" width="800"/>
</p>

## 🗄 Banco de Dados H2

O projeto utiliza o banco H2 em memória para ambiente de teste.
Ao iniciar a aplicação, o Hibernate cria automaticamente as tabelas
com base nas entidades do sistema.

Uma classe de configuração é responsável por popular o banco com
dados iniciais (database seeding), permitindo testar os endpoints
imediatamente após a inicialização.

Exemplo de consulta na tabela de usuários:

<p align="center">
  <img src="assets/Captura de tela 2026-02-20 151246.png" width="800"/>
</p>

## 🔎 Testes com Postman

### 📥 Buscar todos os usuários

Endpoint:
GET /users

Status esperado:
200 OK

<p align="center">
  <img src="assets/Captura de tela 2026-02-20 151508.png" width="800"/>
</p>

A requisição GET retorna uma lista de usuários cadastrados no banco.
O Resource recebe a requisição, o Service executa a lógica e o Repository consulta o banco de dados.
A resposta é convertida automaticamente para JSON pelo Spring Boot.

### 📤 Inserir novo usuário

Endpoint:
POST /users

<p align="center">
  <img src="assets/Captura de tela 2026-02-20 151553.png" width="800"/>
</p>

A requisição POST envia um JSON no corpo da requisição.
O Spring converte automaticamente o JSON para um objeto User.
O Service realiza a persistência e o Repository salva no banco.
A resposta retorna o objeto salvo com ID gerado automaticamente.

### ❌ Buscar usuário inexistente

GET /users/99

<p align="center">
  <img src="assets/Captura de tela 2026-02-20 151623.png" width="800"/>
</p>

Quando um usuário não é encontrado, o Service lança uma exceção personalizada.
A classe ResourceExceptionHandler captura a exceção e retorna uma resposta padronizada com status 404.

## ▶ Como Executar o Projeto

### 📌 Pré-requisitos

- Java 17 ou superior
- Maven
- Git
- IDE (IntelliJ, Eclipse ou VS Code)

---

### 🚀 Passo 1 - Clonar o repositório

```bash
git clone https://github.com/seu-usuario/project-springboot.git
```
### 🚀 Passo 2 - Entrar na pasta do projeto
```bash
cd project-springboot
```
### 🚀 Passo 3 - Executar a aplicação
Você pode executar pela IDE, rodando a classe principal:
WebservicesApplication

```bash
mvn spring-boot:run
```

### 🌐 Acessar a aplicação
A API estará disponível em:
http://localhost:8080

### 🗄 Acessar o H2 Console (perfil de teste)
http://localhost:8080/h2-console

Configuração do H2:
- JDBC URL: jdbc:h2:mem:testdb
- User: sa
- Password: (vazio)

### 🔎 Testar Endpoints

- GET http://localhost:8080/users
- POST http://localhost:8080/users
- GET http://localhost:8080/orders
- GET http://localhost:8080/products

Recomenda-se utilizar o Postman para testar as requisições.

## 👨‍💻 Autor

Desenvolvido por **Vitor Carvalho**

🎓 Estudante de Desenvolvimento de Software  
💻 Foco em Back-End com Java e Spring  
🚀 Em constante evolução e aprendizado

---

## 🔗 Conecte-se comigo

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Vitor%20Carvalho-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/vitorfcgomes/)

---

⭐ Se este projeto foi útil para você, considere dar uma estrela no repositório!
