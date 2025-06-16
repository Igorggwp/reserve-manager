# Sistema de Reserva de Salas

Sistema distribuído para gerenciar usuários, salas e reservas com arquitetura de microserviços.

## Serviços

- **API Gateway (8080)**: interface web e roteamento
- **Usuários (8081)**: cadastro e gestão de usuários
- **Salas (8082)**: cadastro e gestão de salas
- **Reservas (8083)**: criação e cancelamento de reservas

Todos usam PostgreSQL e Kafka

## Tecnologias

- Java 17, Spring Boot
- PostgreSQL, Kafka
- REST APIs
- Docker e Docker Compose

## Funcionalidades

- Gerenciar usuários e salas
- Criar e cancelar reservas
- Verificar disponibilidade e conflitos


## Estrutura

```
reserve-manager/
├── api-gateway/
├── user/
├── room/
├── reserve/
└── docker-compose.yml
```

## Requisitos

- Docker e Docker Compose
- Java 17 e Maven 

