# CivaTrainee

API REST para la gestión de buses, desarrollada con Java 17 y Spring Boot 4.0.6. Permite consultar información de buses, incluyendo su relación con marcas, con soporte de paginación y configuración por entornos.

---

## Tecnologías

* Java 17+
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Spring Security
* Maven
* Docker

---

## Características

* Consulta de buses con paginación
* Obtención de bus por identificador
* Relación entre buses y marcas
* Generación automática de fecha de creación
* Uso de DTOs para transferencia de datos
* Separación de capas (controller, service, repository)
* Configuración mediante variables de entorno
* Contenerización con Docker

---

## Endpoints

### Obtener lista de buses

```
GET /bus?pagina=0&longitud=5
```

### Obtener bus por ID

```
GET /bus/{id}
```

---

## Configuración

La aplicación utiliza variables de entorno para la conexión a la base de datos y configuración de seguridad.

Ejemplo:

```
DB_URL=jdbc:postgresql://localhost:5432/civadb
DB_USERNAME=***
DB_PASSWORD=***

SECURITY_USERNAME = ***
SECURITY_PASSWORD= ***
```

---

## Ejecución

### Con Maven

```
./mvnw spring-boot:run
```

### Con Docker

```
docker-compose up -d --build
```

---

## Estructura del proyecto

```
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── entity/
 ├── dto/
 ├── mapper/
 └── config/
```

---

## Notas

* La seguridad implementada es básica y está orientada a entornos de desarrollo.
* Se recomienda el uso de perfiles para separar configuraciones por entorno.
* Las credenciales no deben almacenarse en el repositorio.

---

## Autor

Vladimir Angelino Sihuincha
