# Sistema de Reserva de Salas

Sistema distribuído para gerenciar usuários, salas e reservas com arquitetura de microserviços.

## Serviços

- **API Gateway (8080)**: interface web e roteamento
- **Usuários (8081)**: cadastro e gestão de usuários
- **Salas (8082)**: cadastro e gestão de salas
- **Reservas (8083)**: criação e cancelamento de reservas

Todos usam PostgreSQL, Kafka e Spring Boot.

## Tecnologias

- Java 17, Spring Boot, Thymeleaf
- PostgreSQL, Kafka
- REST APIs
- Docker e Docker Compose

## Funcionalidades

- Gerenciar usuários e salas
- Criar e cancelar reservas
- Verificar disponibilidade e conflitos

## Como Rodar

### Scripts PowerShell

```powershell
.\start-services.ps1   # Inicia
.\stop-services.ps1    # Para
```

### Manual

```bash
docker-compose up -d
```

Acesse: [http://localhost:8080/reservas](http://localhost:8080/reservas)

## Estrutura

```
reservas-salas-microservices/
├── api-gateway/
├── usuario-service/
├── sala-service/
├── reserva-service/
├── start-services.ps1
├── stop-services.ps1
└── docker-compose.yml
```

## Requisitos

- Docker e Docker Compose
- Java 17 e Maven (dev)
- PowerShell (Windows)

## Problemas Comuns

```powershell
docker-compose logs -f     # Ver logs
docker-compose ps          # Ver status
docker-compose down -v     # Resetar tudo
```
