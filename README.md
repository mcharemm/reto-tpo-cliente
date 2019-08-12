# reto-tpo-cliente

---

## API SERVICE CLIENTES
#### Desarrollado en Java con Spring Boot

---

### _FUNCIONALIDAD_

---

El servicio tiene las siguientes funcionalidades:

* **Crear Cliente:** Crear objetos clientes y almacenarlos dentro de una base de datos Firebase.
* **Consultar Clientes:** Hacer la consulta de todos los clientes que existen en la base de datos Firebase con toda la información, incluyendo además la fecha probable de muerte para cada uno de ellos.
* **Consultar KPI de Clientes:** Presenta la edad promedio de todos los clientes que se encuentran en la base de datos y la desviación estándar de estas edades.

---

### _ENDPOINTS_

---

(1) CREAR CLIENTE

---

`/api/v1/cliente/creacliente`

- Metodo

`POST`

- Datos de entrada

`{
  "name": "<nombre_del_cliente>",
  "lastName": "<apellido_del_cliente",
  "age": "<edad_del_cliente>",
  "birthDate": "<fecha_de_nacimiento_del_cliente>"
}`

- Tipo de datos (entrada)

`{
 "name": String,
 "lastName": String,
 "age", Integer,
 "birthDate": Date("yyyy-mm-dd")
}`

---

(2) CONSULTAR CLIENTES

---

`/api/v1/cliente/listclientes`

- Metodo

`GET`

- Datos de entrada

`Ninguno`

- Tipo de datos (response)

`{
 "name": String,
 "lastName": String,
 "age", Integer,
 "birthDate": Date("yyyy-mm-dd"),
 "possibleDeathDate": Date("yyyy-mm-dd")
}`

---

(3) CONSULTAR KPI DE CLIENTES

---

`/api/v1/statistic/kpideclientes`

- Metodo

`GET`

- Datos de entrada

`Ninguno`

- Tipo de datos (response)

`{
 "averageAge": Double,
 "standardDeviation": Double"
}`

PUERTO DE APLICACION

`8080`
