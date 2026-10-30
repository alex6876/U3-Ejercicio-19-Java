Aquí tienes la consolidación oficial de esta lección para el `README.md` del repositorio de **Programación Orientada a Objetos (POO)** en memoria:

---

# 📇 Simulación de Gestión de Contactos y Validación (Encapsulamiento y Regex en Java)

Este módulo modela una libreta de contactos personales en memoria, aplicando validaciones estrictas mediante expresiones regulares para números telefónicos y comprobaciones estructurales para correos electrónicos.

---

## 🧩 Clases y Estructura del Sistema

* **`Contacto`**: Administra la información personal protegiendo sus campos mediante modificadores privados.
* **Atributos privados (`private`)**: `nombre`, `numeroTelefono` y `correoElectronico`.
* **Constructor y Modificadores Seguros**: Validan los datos desde el momento de la instanciación y ante cualquier intento de actualización posterior.
* **Métodos operativos**: `setNumeroTelefono`, `setCorreoElectronico` y `obtenerDatos()`.


* **`Main`**: Ejecuta las pruebas de inserción inicial, simula fallos de validación con datos incorrectos y corrobora el estado final tras aplicar modificaciones válidas.

---

## ⚙️ Reglas de Negocio y Validación

1. **Validación por Expresiones Regulares (`Regex`):** El número de teléfono se filtra utilizando `.matches("[0-9+() -]+")` para garantizar que solo admita dígitos y caracteres estándar permitidos, rechazando letras y símbolos no válidos.
2. **Integridad del Correo:** Se verifica de manera estricta la presencia obligatoria del carácter `@` para asegurar una estructura mínima de contacto.
3. **Encapsulamiento Defensivo:** Evita que campos sensibles o con formato crítico sean alterados de forma directa sin pasar por las validaciones lógicas de la clase.

---

## 💻 Salida por Consola

```text
Teléfono actualizado correctamente.
Correo actualizado correctamente.

--- DATOS INICIALES ---
Nombre: Juan
Teléfono: 2615551234
Correo: juan@gmail.com

--- DATOS INCORRECTOS ---
Error: el teléfono no puede contener letras.
Error: el correo debe contener @.

--- DATOS CORRECTOS ---
Teléfono actualizado correctamente.
Correo actualizado correctamente.

--- ESTADO FINAL ---
Nombre: Juan
Teléfono: 2614445566
Correo: juan@hotmail.com

```
