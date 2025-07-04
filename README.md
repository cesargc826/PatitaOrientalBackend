# 🐾 Patita Oriental - Backend
Este repositorio contiene el backend del e-commerce **Patita Oriental**, una tienda de comida coreana que busca digitalizar y automatizar su sistema de pedidos y gestión de productos.


## 🚀 Objetivos Generales
- Desarrollar una API RESTful robusta utilizando **Java + Spring Boot**.
- Implementar persistencia de datos con **MySQL**.
- Integrar el backend con un frontend desarrollado en **React**.
- Mejorar la gestión de productos, usuarios y pedidos.
- Permitir la administración de la tienda mediante un panel privado para administradores.


## ⚙️ Tecnologías Utilizadas
- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Gradle
- JWT (JSON Web Tokens) para autenticación
- Swagger para documentación de API

---

## 📁 Estructura del Proyecto
src
└── main
├── java
│ └── com.patitaoriental
│ ├── controller
│ ├── model
│ ├── repository
│ ├── service
│ └── security
└── resources
├── application.properties
└── schema.sql

yaml
Copiar
Editar

---

## 🧪 Endpoints principales

Ejemplo de rutas implementadas:

| Método | Endpoint               | Descripción                         |
|--------|------------------------|-------------------------------------|
| POST   | `/api/auth/login`      | Iniciar sesión                      |
| POST   | `/api/auth/register`   | Registro de usuario                 |
| GET    | `/api/productos`       | Listar todos los productos          |
| POST   | `/api/pedidos`         | Crear un nuevo pedido               |
| PUT    | `/api/usuarios/{id}`   | Editar perfil de usuario            |
| DELETE | `/api/productos/{id}`  | Eliminar un producto (admin)        |

---

## 🔧 Cómo ejecutar el proyecto localmente

1. Clona el repositorio:

```bash
git clone https://github.com/tu-usuario/patita-oriental-backend.git
Accede a la carpeta del proyecto:

bash
Copiar
Editar
cd patita-oriental-backend
Configura la base de datos en src/main/resources/application.properties:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/patitaoriental
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
Ejecuta el proyecto:

Con Gradle:
bash
Copiar
Editar
./gradlew bootRun
O desde tu IDE (Eclipse, IntelliJ)



📦 Base de Datos
La base de datos se llama patitaoriental y contiene las siguientes tablas:
1.Users
2.Products
3.Roles
4.Categories
5.Purchases
Tablas puente:
-Favorites
-Purchases has Products


👨‍💻 Colaboradores
Este proyecto fue desarrollado por:
-Nancy Mayek Torres Aguilar
-César Daniel Godínez Caudillo
-América Yazmín Rodríguez Rodríguez
-Francisco Javier Caldera Castro
-Cecilia Guadalupe Gutierrez Urbano
-Shelder Tatiana Flores Durán
-Abigail Alexandra Galvez Cortés
-José Gabriel Álvarez Pérez

📌 Notas adicionales
Este backend se conecta con el frontend desarrollado en React.
Es parte del proyecto integrador del bootcamp de desarrollo Full Stack.
