# Produto API - Bootcamp Backend Java (DIO)

Projeto criado durante o **Bootcamp Backend Java**, na aula **"Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework"**.

Aplicação REST simples para gerenciar **Produtos**, construída com **Spring Boot 3**, **Spring Data JPA** e **H2** (banco em memória). Inclui documentação automática via **OpenAPI/Swagger** (springdoc).

## Endpoints principais
- `POST /api/produtos` — criar produto
- `GET /api/produtos` — listar produtos
- `GET /api/produtos/{id}` — buscar por id
- `PUT /api/produtos/{id}` — atualizar
- `DELETE /api/produtos/{id}` — deletar

## Como rodar
1. Build: `mvn clean package`
2. Run: `mvn spring-boot:run` ou executar o jar em `target/`

Acesse a documentação em: `http://localhost:8080/swagger-ui.html` ou `http://localhost:8080/swagger-ui/index.html`

