# API REST de Clínica Allura

Este repositorio contiene el código fuente de una API REST para la Clínica Allura, un sistema de gestión de médicos con especialidades. Esta API permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) relacionadas con los médicos y sus especialidades.

## Características

- Registro de médicos con detalles como nombre, email, teléfono y dirección.
- Búsqueda de médicos por especialidad.
- Actualización de información de médicos existentes.
- Eliminación lógica de médicos (desactivación).
- Seguridad implementada con Spring Security y tokens JWT.

## Requisitos

Antes de comenzar, asegúrate de tener instalados los siguientes componentes:

- Java Development Kit (JDK)
- Spring Boot
- Base de datos compatible (se debe configurar en el archivo `application.properties`)

## Configuración

1. Clona este repositorio en tu máquina local.

```shell
git clone https://github.com/tu-usuario/tu-repo.git
```

2. Configura la base de datos en el archivo `application.properties`.

```properties
# Configuración de la base de datos
spring.datasource.url=jdbc:mysql://localhost:3306/clinica_allura
spring.datasource.username=tu-usuario
spring.datasource.password=tu-contraseña
```

3. Ejecuta la aplicación Spring Boot.

```shell
./mvnw spring-boot:run
```

## Uso

### Registro de Médicos

Puedes registrar un médico utilizando una solicitud HTTP POST a la siguiente URL:

```
POST /medicos
```

Envía los detalles del médico en el cuerpo de la solicitud en formato JSON. A continuación, se muestra un ejemplo de solicitud:

```json
{
  "nombre": "Dr. Juan Pérez",
  "email": "juan.perez@example.com",
  "telefono": "123-456-7890",
  "especialidad": "Cardiología",
  "direccion": {
    "calle": "Calle Principal",
    "distrito": "Centro",
    "ciudad": "Ciudad Allura",
    "numero": "123",
    "complemento": "Edificio A"
  }
}
```

### Búsqueda de Médicos por Especialidad

Puedes buscar médicos por especialidad utilizando una solicitud HTTP GET a la siguiente URL:

```
GET /medicos?especialidad=Cardiología
```

### Actualización de Médicos

Para actualizar la información de un médico, utiliza una solicitud HTTP PUT a la siguiente URL:

```
PUT /medicos
```

Envía los detalles actualizados del médico en el cuerpo de la solicitud en formato JSON.

### Eliminación Lógica de Médicos

Puedes desactivar un médico utilizando una solicitud HTTP DELETE a la siguiente URL:

```
DELETE /medicos/{id}
```

Reemplaza `{id}` con el ID del médico que deseas desactivar.

## Contribución

Si deseas contribuir a este proyecto, por favor, sigue estas pautas:

1. Crea un fork del repositorio.
2. Crea una rama para tu función/feature (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y documenta cualquier adición o cambio significativo.
4. Envía una solicitud de extracción (pull request) a este repositorio.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.

