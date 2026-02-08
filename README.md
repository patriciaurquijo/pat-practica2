 Práctica 2 – API REST Carrito

En esta práctica he desarrollado una API REST sencilla utilizando Spring Boot.  
El objetivo es implementar las operaciones básicas CRUD (Create, Read, Update, Delete) sobre el recurso Carrito, simulando el comportamiento de un carrito de compra.

# Estructura del carrito

Un carrito tiene los siguientes campos:

- idCarrito: identificador único del carrito.
- idArticulo: identificador del artículo.
- descripcion: texto descriptivo del producto.
- unidades: número de unidades del producto.
- precioFinal: precio total del carrito.

---

# Endpoints de la API

| Método |  Ruta   | Descripción | Posibles respuestas |
|--------|---------|-------------|---------------------|
| GET | `/api/carrito` | Devuelve todos los carritos | 200 |
| GET | `/api/carrito/{idCarrito}` | Devuelve un carrito concreto | 200, 404 |
| POST | `/api/carrito` | Crea un nuevo carrito | 201, 400, 409 |
| PUT | `/api/carrito/{idCarrito}` | Modifica un carrito existente | 200, 400, 404 |
| DELETE | `/api/carrito/{idCarrito}` | Elimina un carrito | 204, 404 |

---

# Ejemplo de petición (POST o PUT)

```json
{
  "idCarrito": 1,
  "idArticulo": 10,
  "descripcion": "Zapatillas",
  "unidades": 2,
  "precioFinal": 49.99
}
