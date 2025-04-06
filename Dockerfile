version: "3.8"
services:
  userms:
    build: UserMS/user
    ports:
      - "8083:8083"
    depends_on:
      - dbuser
    environment:
      SPRING_APPLICATION_NAME: user
      SPRING_DATASOURCE_URL: jdbc:postgresql://dbuser:5432/user
      SPRING_DATASOURCE_USERNAME: postgres
      SPRING_DATASOURCE_PASSWORD: admin
      SPRING_JPA_DATABASE_PLATFORM: org.hibernate.dialect.PostgreSQLDialect
      SPRING_JPA_HIBERNATE_DDL_AUTO: update
      SERVER_PORT: 8083
    networks:
      - msNet

  roomms:
    build: RoomMS/room
    ports:
      - "8084:8084"
    depends_on:
      - dbroom
    environment:
      SPRING_APPLICATION_NAME: room
      SPRING_DATASOURCE_URL: jdbc:postgresql://dbroom:5432/room
      SPRING_DATASOURCE_USERNAME: postgres
      SPRING_DATASOURCE_PASSWORD: admin
      SPRING_JPA_DATABASE_PLATFORM: org.hibernate.dialect.PostgreSQLDialect
      SPRING_JPA_HIBERNATE_DDL_AUTO: update
      SERVER_PORT: 8084
    networks:
      - msNet

  reservems:
    build: ReserveMS/reserve
    ports:
      - "8085:8085"
    depends_on:
      - dbreserve
    environment:
      SPRING_APPLICATION_NAME: reserve
      SPRING_DATASOURCE_URL: jdbc:postgresql://dbreserve:5432/reserve
      SPRING_DATASOURCE_USERNAME: postgres
      SPRING_DATASOURCE_PASSWORD: admin
      SPRING_JPA_DATABASE_PLATFORM: org.hibernate.dialect.PostgreSQLDialect
      SPRING_JPA_HIBERNATE_DDL_AUTO: update
      SERVER_PORT: 8085
    networks:
      - msNet

  dbuser:
    image: postgres:15
    container_name: dbuser
    restart: always
    ports:
      - "5433:5432"
    environment:
      POSTGRES_DB: user
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: admin
    networks:
      - msNet
    volumes:
      - userdbdata:/var/lib/postgresql/data

  dbroom:
    image: postgres:15
    container_name: dbroom
    restart: always
    ports:
      - "5434:5432"
    environment:
      POSTGRES_DB: room
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: admin
    networks:
      - msNet
    volumes:
      - roomdbdata:/var/lib/postgresql/data

  dbreserve:
    image: postgres:15
    container_name: dbreserve
    restart: always
    ports:
      - "5435:5432"
    environment:
      POSTGRES_DB: reserve
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: admin
    networks:
      - msNet
    volumes:
      - reservedbdata:/var/lib/postgresql/data

  adminer:
    image: adminer
    restart: always
    ports:
      - "8080:8080"
    networks:
      - msNet

networks:
  msNet:

volumes:
  userdbdata:
  roomdbdata:
  reservedbdata:
