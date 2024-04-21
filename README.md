# MS_Seguridad And ApiRestInterface

ApiRestInterface es una aplicación que proporciona una interfaz de API REST para administrar usuarios. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en entidades de usuario. Apoyando asi el microservicio de seguridad para la materia de lenguaje de programación avanzada 2 en el ciclo 2024-1

## Funcionalidades

- **Obtener todos los usuarios**: Endpoint para obtener una lista de todos los usuarios registrados en el sistema.
- **Crear un nuevo usuario**: Endpoint para agregar un nuevo usuario al sistema.
- **Obtener un usuario por ID**: Endpoint para obtener información detallada de un usuario específico mediante su ID.
- **Actualizar un usuario existente**: Endpoint para actualizar la información de un usuario existente en el sistema.
- **Eliminar un usuario**: Endpoint para eliminar un usuario existente del sistema mediante su ID.

## Tecnologías utilizadas

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## Estructura del proyecto

El proyecto está estructurado de la siguiente manera:

- **Controllers**: Contiene los controladores REST que manejan las solicitudes HTTP.
- **Models**: Contiene las clases de modelo que representan las entidades de la base de datos.
- **Repositories**: Contiene las interfaces de repositorio que definen métodos para interactuar con la base de datos.
- **Services**: Contiene los servicios que implementan la lógica de negocio para manipular las entidades.

## Configuración

La configuración de la aplicación se realiza a través del archivo `application.properties`, donde se especifican detalles como el nombre de la aplicación, la configuración de la base de datos MySQL, etc.

## Instalación

Para ejecutar la aplicación localmente, sigue estos pasos:

1. Clona este repositorio en tu máquina local.
2. Asegúrate de tener configurada una base de datos MySQL y ajusta la configuración en el archivo `application.properties` según sea necesario.
3. Abre el proyecto en tu IDE preferido.
4. Ejecuta la aplicación como una aplicación Spring Boot.

## Contribución

Si deseas contribuir a este proyecto, ¡estás más que bienvenido! Siéntete libre de abrir un problema o enviar una solicitud de extracción.

## Autor

- [Tu nombre o alias](https://github.com/tu-usuario) - Descripción corta sobre ti.

