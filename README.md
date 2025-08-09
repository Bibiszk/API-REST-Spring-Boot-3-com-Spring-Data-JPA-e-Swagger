# API REST Spring Boot 3 - Demo

Este projeto é uma API REST simples construída com Java 17 e Spring Boot 3.

## Funcionalidades

- CRUD básico da entidade "Produto" (id, nome, descrição, preço)
- Persistência usando Spring Data JPA com banco de dados H2 em memória
- Documentação automática da API com OpenAPI/Swagger em `/swagger-ui.html`

## Como rodar

### Pré-requisitos

- Java 17 instalado
- Maven instalado

### Rodar o projeto

No terminal, dentro da pasta do projeto, rode:

```bash
mvn spring-boot:run
A API estará disponível em http://localhost:8080/produtos.

Documentação
A documentação Swagger está disponível em:
http://localhost:8080/swagger-ui.html
