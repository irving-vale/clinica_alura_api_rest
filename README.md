¡Gracias por la información adicional! Puedes agregar secciones en tu README para documentar las pruebas con JUnit y Mockito, así como la documentación en Swagger. Aquí tienes una versión actualizada de tu README que incluye estas secciones:

```markdown
# API REST de Clínica Allura

Este repositorio contiene el código fuente de una API REST para la Clínica Allura, un sistema de gestión de médicos con especialidades, pacientes y consultas médicas. Esta API permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) relacionadas con médicos, pacientes, consultas y horarios de consultas.

## Características

- Registro de médicos con detalles como nombre, email, teléfono y dirección.
- Registro de pacientes con detalles como nombre, email, teléfono y dirección.
- Registro de consultas médicas con información detallada, incluyendo médico, paciente y fecha.
- Búsqueda de médicos por especialidad.
- Búsqueda de pacientes por nombre o número de identificación.
- Agenda de consultas que permite programar y gestionar horarios de consultas médicas.
- Actualización de información de médicos, pacientes y consultas existentes.
- Eliminación lógica de médicos, pacientes y consultas (desactivación).
- Seguridad implementada con Spring Security y tokens JWT.
- Pruebas unitarias con JUnit y Mockito.
- Documentación en Swagger para una fácil comprensión y prueba de la API.

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

### Registro de Pacientes

Puedes registrar un paciente utilizando una solicitud HTTP POST a la siguiente URL:

```
POST /pacientes
```

Envía los detalles del paciente en el cuerpo de la solicitud en formato JSON, similar al registro de médicos.

### Búsqueda de Pacientes

Puedes buscar pacientes por nombre o número de identificación utilizando una solicitud HTTP GET a la siguiente URL:

```
GET /pacientes?nombre=Juan
```

### Registro de Consultas

Puedes registrar una consulta médica utilizando una solicitud HTTP POST a la siguiente URL:

```
POST /consultas
```

Envía los detalles de la consulta en el cuerpo de la solicitud en formato JSON, incluyendo información sobre el médico, el paciente y la fecha de la consulta.

### Agenda de Consultas

La API también proporciona funcionalidad para gestionar horarios de consultas médicas. Puedes crear, leer, actualizar y eliminar horarios de consultas utilizando las rutas y métodos correspondientes.

## Pruebas Unitarias

Se han realizado pruebas unitarias utilizando JUnit y Mockito para garantizar la calidad del código y la funcionalidad de la API. Puedes ejecutar estas pruebas para asegurarte de que todo funciona correctamente.

## Documentación en Swagger

La documentación completa de la API se encuentra disponible en Swagger para facilitar su comprensión y prueba. Puedes acceder a la documentación en la siguiente URL:

```
http://localhost:8080/swagger-ui.html
```

## Contribución

Si deseas contribuir a este proyecto, por favor, sigue estas pautas:

1. Crea un fork del repositorio.
2. Crea una rama para tu función/feature (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y documenta cualquier adición o cambio significativo.
4. Envía una solicitud de extracción (pull request) a este repositorio.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.
```

Este README ahora incluye secciones para las pruebas unitarias con JUnit y Mockito, así como la documentación en Swagger para facilitar la comprensión y prueba de la API. Asegúrate de proporcionar la URL correcta para acceder a la documentación de Swagger en tu aplicación.