# CINEDL - Sistema de Compra de Entradas de Cine

Un sistema de gestión y compra de entradas de cine desarrollado en Java con interfaz gráfica Swing.

## 📋 Descripción

CINEDL es una aplicación de escritorio que permite a los usuarios navegar por una cartelera de películas, seleccionar asientos y comprar entradas de cine de manera fácil e intuitiva.

## 🎬 Funcionalidades

- **Login de Usuarios**: Sistema de autenticación seguro para acceder a la plataforma
- **Cartelera de Películas**: Visualización de películas disponibles con portadas
- **Selección de Asientos**: Interfaz interactiva para elegir asientos en la sala
- **Descripción de Películas**: Información detallada de cada película
- **Generación de Tickets**: Creación y gestión de entradas compradas
- **Conexión a Base de Datos**: Almacenamiento persistente de datos

## 🎥 Películas Disponibles

- Blade Runner
- Conjuring
- Hereditary
- Interstellar
- Iron Giant
- La La Land
- The Matrix
- Spider-Man
- Whiplash
- Your Name

## 📁 Estructura del Proyecto

```
CINEDL/
├── Login.java              # Módulo de autenticación
├── Login.form              # Interfaz de login
├── PaginaPrincipal.java    # Cartelera de películas
├── PaginaPrincipal.form    # Interfaz de cartelera
├── Asientos.java           # Selección de asientos
├── Asientos.form           # Interfaz de asientos
├── Ticket.java             # Generación de tickets
├── Ticket.form             # Interfaz de tickets
├── VentanaDescripcion.java # Descripción de películas
├── VentanaDescripcion.form # Interfaz de descripción
├── Conexion.java           # Gestión de conexión a BD
├── Imagenes/               # Portadas de películas
└── README.md              # Este archivo
```

## 🛠️ Requisitos

- **Java 8** o superior
- **NetBeans IDE** (opcional, pero recomendado)
- **MySQL** o compatible para la base de datos
- **Swing** (incluido en Java)

## 🚀 Instalación y Uso

### 1. Preparar la Base de Datos

Asegúrate de tener una base de datos configurada con las tablas necesarias para:
- Usuarios
- Películas
- Asientos
- Entradas/Tickets

### 2. Configurar la Conexión

Edita el archivo `Conexion.java` con los datos de tu base de datos:
```java
// Modificar URL, usuario y contraseña según tu servidor
String url = "jdbc:mysql://localhost:3306/cinedl";
String usuario = "root";
String contraseña = "tu_contraseña";
```

### 3. Compilar y Ejecutar

**Con NetBeans:**
1. Abre el proyecto en NetBeans
2. Haz clic en "Run Project" (F6)

**Desde terminal:**
```bash
javac -d . *.java
java -cp . CINEDL.Login
```

## 📝 Clases Principales

### `Login.java`
Gestiona la autenticación de usuarios. Valida credenciales contra la base de datos.

### `PaginaPrincipal.java`
Muestra la cartelera con las películas disponibles. Permite seleccionar una película para comprar entradas.

### `Asientos.java`
Interfaz para seleccionar asientos disponibles en una función específica.

### `Ticket.java`
Genera y muestra el ticket de compra con detalles de la transacción.

### `VentanaDescripcion.java`
Muestra información detallada de la película seleccionada (sinopsis, duración, calificación, etc.).

### `Conexion.java`
Administra la conexión con la base de datos y proporciona métodos para consultas CRUD.

## 💾 Base de Datos

### Tablas Necesarias

**Usuarios:**
- id_usuario
- nombre_usuario
- contraseña
- email

**Películas:**
- id_pelicula
- nombre
- descripcion
- duracion
- calificacion

**Asientos:**
- id_asiento
- numero_asiento
- id_sala
- disponible

**Entradas:**
- id_entrada
- id_usuario
- id_pelicula
- id_asiento
- fecha_compra
- precio

## 🎨 Interfaz de Usuario

La aplicación utiliza componentes Swing para crear una interfaz intuitiva y responsiva:
- Botones con imágenes de películas
- Grillas para selección de asientos
- Formularios para registro y login
- Ventanas emergentes para descripciones y confirmaciones

## 📄 Licencia

Este proyecto es parte del curso de Programación Visual 2024 en UNEDL.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor:
1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📞 Contacto

Para más información o reportar problemas, contacta al desarrollador.

---

**Última actualización:** 2024
**Versión:** 1.0
