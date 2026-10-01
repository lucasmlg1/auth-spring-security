# Auth API — versão sem Spring Security/JWT

Esta versão remove intencionalmente toda a implementação de autenticação baseada em
Spring Security e JWT para que ela possa ser implementada posteriormente como exercício.

## Removido

- Spring Security
- JWT / `java-jwt`
- `SecurityConfigurations`
- `SecurityFilter`
- `TokenService`
- `AuthorizationService`
- Controller de login/registro que dependia do Spring Security
- Configuração `api.security.token.secret`

## Mantido

- Spring Web
- Spring Data JPA
- PostgreSQL
- Flyway
- Validação
- Lombok
- API de produtos
- Entidade `User` e `UserRole`, para servir de base à implementação da autenticação

A API de produtos fica sem proteção nesta versão. Esse é o estado intencional do projeto:
você pode implementar o Spring Security/JWT por conta própria.

## Executar

Configure o PostgreSQL conforme `application.properties` e execute:

```bash
./mvnw spring-boot:run
```

Endpoints disponíveis nesta versão:

- `POST /product`
- `GET /product`

A autenticação não está implementada propositalmente.
