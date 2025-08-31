<table align="center">
    <thead>
        <tr>
            <td><img src="https://1.bp.blogspot.com/-3wALNMake70/XK-07VtIngI/AAAAAAABOrY/n3X_ZJV5fGEpTs8ppMQvKk_yic7BfyBYQCLcBGAs/s1600/universidad-la-salle-logo.jpg?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD LA SALLE</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE SOFTWARE</span><br />
            </th>
        </tr>
    </thead>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Trabajo 2</td></tr>
    </tbody>
</table>

<div align="center">
    <span style="font-weight:bold;">GUÍA DEL AVANCE</span><br />
</div>

<div>
    <table border="1" align="center">
        <thead>
            <tr><th colspan="3">INFORMACIÓN BÁSICA</th></tr>
        </thead>
        <tbody>
            <tr>
                <td colspan="2">
                    <table>
                        <tr><td>ASIGNATURA:</td><td>Programción para Dispositivos Moviles</td></tr>
                        <tr><td>TÍTULO DEL TRABAJO:</td><td> Introducción a Kotlin</td></tr>
                        <tr>
                            <td>NÚMERO DEL TRABAJO:</td><td>02</td>
                            <td>AÑO:</td><td>2025</td>
                            <td>NRO. SEMESTRE:</td><td>VI</td>
                        </tr>
                        <tr>
                            <td colspan="6">DOCENTE:
                                <ul>
                                    <li>Josue Miguel Flores Parra - jfloresp@ulasalle.edu.pe</li>
                                </ul>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6">INTEGRANTE:
                                <ul>
                                    <li>Ortiz Rosas Joshua David</li>
                                </ul>
                            </td>
                        </tr>
                    </table>
                </td>
                <td>
                    </table>
                    <table>
                </td>
            </tr>
        </tbody>
    </table>
</div>

## **Tablero de Commits Importantes**

| Nro. |Código |Commits |
| ------------- | ------------- | ------------- |
| 1  | 73e8e41 | Creando carpeta y README del segundo entregable |
| 2  | 8c56274 | Subiendo codigo Clase para Cuenta Bancaria |
| 3  | e748da9 | Subiendo codigo Clase para Producto |
| 4  | cbdbe61 | Subiendo el codigo de Figuras |
| 5  | eaf0bb3 | Subiendo Sistema de Gestion Biblioteca |
| 6  | a8e3e26 | Arreglndo codigo Sistema de Gestión de Biblioteca.kt |
| 7  | b504e0e | Creando bade inicial del README |
| 8  | bc18ce3| Primer avance del README |
| 9  | b60ffb7 | Modificando readme de segundo entregable |
| 10  | ff8bf8c | Arreglando codigo de Cuenta Bancaria.kt |
| 11  | e3cc0a4 | Solucionando funcion main de Producto.kt |
| 12  | 36c7366 | Agregando decripicion Figuras.kt |
| 13  | b01d6c1 | Modificando funcion main Producto.kt |
| 14  | 401ee97 | Arreglando readme |
| 15  | df16a2a | Culminando README.md |
| 16  | 48ec78f | Mejorando subtitulos README.md |

## Codigos:
### 1. Clase para Cuenta Bancaria:
Este código implementa una clase CuentaBancaria en Kotlin que modela una cuenta con saldo y límite de retiro.
  - Se valida que el saldo inicial no sea negativo y que el límite de retiro sea mayor que cero.
  - Tiene propiedades con getters y setters que permiten leer y modificar el saldo y el límite, validando siempre los datos.
  - El método retirar(monto) controla que el retiro no exceda el saldo disponible ni el límite permitido, y actualiza el saldo si la operación es válida.

**En el main, el programa:**
  -Solicita al usuario el saldo inicial y el límite de retiro.
  -Crea una cuenta con esos valores.
  -Pide dos montos a retirar y ejecuta la operación mostrando mensajes de éxito o error según las condiciones.

En resumen: es un pequeño sistema interactivo que permite crear una cuenta bancaria, validar sus datos y realizar retiros con restricciones.

**Ejemplo de uso:**  

```bash
Ingrese saldo inicial: 800
Ingrese límite de retiro: 300
Ingrese monto a retirar: 350
No puedes retirar más del límite permitido.

Ingrese monto a retirar: 150
Retiro exitoso. Saldo restante: 650.0
```

🔗 [Ejercicio desarrollado](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Segundo-Entregable/Clase%20para%20Cuenta%20Bancaria.kt)

### 2. Clase para Producto:
Este proyecto implementa una **clase Producto** que representa un artículo con un **precio** y un **descuento aplicable**.  
El objetivo es demostrar el uso de **encapsulación, validación de datos y getters/setters** en Kotlin.

---

#### Funcionalidad

- **Atributos principales:**
  - `precio`: Representa el precio base del producto.
  - `descuento`: Porcentaje de descuento aplicado (0% - 100%).

- **Validaciones:**
  - El precio debe ser mayor a `0`. Si no, se ajusta a `1`.
  - El descuento debe estar en el rango `0` a `100`. Si no, se ajusta a `0`.

- **Métodos principales:**
  - `setPrecio(nuevoPrecio: Int)`: Cambia el precio con validación.
  - `getPrecio(): Int`: Devuelve el precio actual.
  - `setDescuento(nuevoDescuento: Int)`: Cambia el descuento con validación.
  - `getDescuento(): Int`: Devuelve el descuento actual.
  - `calcularPrecioFinal(): Double`: Calcula el precio después del descuento.
  - `imprimirInformacion()`: Muestra en consola todos los datos del producto.

**Ejemplo de uso:**  

```bash
Descuento inválido. Debe estar entre 0 y 100.
Información del producto:
Precio actual: 200.0
Descuento aplicado: 15%
Precio final con descuento: 170.0
```
🔗 [Ejercicio desarrollado](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Segundo-Entregable/Clase%20para%20Producto.kt)

### 3. Figuras:
Ejemplo de herencia y polimorfismo con una clase abstracta `Figura` y subclases `Circulo`, `Rectangulo` y `Triangulo`.  
Cada figura implementa su propio cálculo de área.  

#### Funcionalidad  
- Clase abstracta `Figura` con método `area()`.  
- Subclases implementan el cálculo específico.  
- Uso de polimorfismo en `main()`.

**Ejemplo de uso:**  

```bash
Atributos del Cuadrado:
Lado: 4
Resultados del Cuadrado
Área: 16.0
Perímetro: 16.0

Atributos del Rectángulo:
Base: 5
Altura: 3
Resultados del Rectángulo
Área: 15.0
Perímetro: 16.0

Atributos del Círculo:
Radio: 2.5
Resultados del Círculo
Área: 19.634954084936208
Perímetro: 15.707963267948966
```
🔗 [Ejercicio desarrollado](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Segundo-Entregable/Figuras.kt)

### 4. Gestion de Biblioteca:
Proyecto en Kotlin que simula una biblioteca con materiales, usuarios y préstamos.  
Se implementa herencia, interfaces, clases abstractas y uso de colecciones.  

#### Estructura  
- **Material (abstracta):** Clase base con `titulo`, `autor`, `anioPublicacion`.  
- **Libro / Revista:** Subclases con atributos y `mostrarDetalles()`.  
- **Usuario:** Data class con `nombre`, `apellido`, `edad`.  
- **IBiblioteca:** Interfaz con métodos para registrar, prestar y devolver materiales.  
- **Biblioteca:** Implementa `IBiblioteca`, gestiona materiales y préstamos con `List` y `Map`.  

#### Funcionalidad  
- Registrar materiales y usuarios.  
- Prestar y devolver libros o revistas.  
- Mostrar materiales disponibles y reservados por usuario.

**Ejemplo de uso:**  

```bash
Material registrado: 1984
Material registrado: National Geographic
Usuario registrado: Carlos Gómez
Materiales disponibles:
Libro: 1984, Autor: George Orwell, Año: 1949, Género: Distopía, Páginas: 328
Revista: National Geographic, Autor: Varios, Año: 2024, ISSN: 1234-5678, Volumen: 102, Número: 5, Editorial: NatGeo Publishing
Material prestado: 1984 a Carlos Gómez
Materiales disponibles:
Revista: National Geographic, Autor: Varios, Año: 2024, ISSN: 1234-5678, Volumen: 102, Número: 5, Editorial: NatGeo Publishing
Materiales reservados por Carlos Gómez:
Libro: 1984, Autor: George Orwell, Año: 1949, Género: Distopía, Páginas: 328
Material devuelto: 1984 por Carlos Gómez
Materiales disponibles:
Revista: National Geographic, Autor: Varios, Año: 2024, ISSN: 1234-5678, Volumen: 102, Número: 5, Editorial: NatGeo Publishing
Libro: 1984, Autor: George Orwell, Año: 1949, Género: Distopía, Páginas: 328
Materiales reservados por Carlos Gómez:
No tiene materiales en préstamo.
```
🔗 [Ejercicio desarrollado](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Segundo-Entregable/Sistema%20de%20Gesti%C3%B3n%20de%20Biblioteca.kt)
