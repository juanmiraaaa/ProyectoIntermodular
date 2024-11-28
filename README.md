# Taquilla Cine Online

Taquilla online de venta de entradas para un cine

## INDICE
- [**Integrantes**](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#integrantes)
- [**Enlaces de interés**](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#enlaces-de-interes)
- [**Introducción**](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#introduccion)
- [**Descripción del Proyecto**](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#descripcion-del-proyecto)
- [**Análisis de Requisitos**](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#analisis-de-requisitos)

## INTEGRANTES
[Al Índice](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#indice)

- Juan Mira
- Ismael
- Siham
- Andrés

## ENLACES DE INTERES
[Al Índice](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#indice)

- [Diseño Conceptual BBDD](https://github.com/juanmiraaaa/ProyectoIntermodular/blob/main/Documentos/Diagrama-ER/Diagrama_ER.md)

## INTRODUCCION
[Al Índice](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#indice)

Una empresa del entorno opera varios cines y nos han pedido desarrollar una taquilla online que permita a sus clientes consultar la cartelera y comprar sus entradas por adelantado.

### DESCRIPCION DEL PROYECTO
[Al Índice](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#indice)

Una empresa opera varios cines en el entorno. El cliente quiere que los clientes puedan consultar la cartelera, los horarios de las distintas sesiones, y que se les permita escoger una butaca y comprar su entrada para ver la película.

La App debe de registrar las Pelíuclas, Sesiones, Butacas, Salas y Usuarios Refistrados.

Los clientes deben de poder ver los detalles de las películas, como su elenco de actores, actores, director, una breve sinopsis, un trailer de la misma. Al usuario le aparecerán las sesiones de los distintos días, una vez selecciconado el día, a este le aparecerá las butacas disponibles.

Los usuarios se pueden registrar. Si quieres comprar tienes que estar registrado. Una vez compras la entrada, esta aparecerá en el área de cliente junto con la factura

## ANALISIS DE REQUISITOS
[Al Índice](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#indice)

### CARTELERA

#### Vista Principal:
Mostraremos un HERO junto con un selector de cine. Una vez selecciones el cine, el cliente verá la cartelera del cine en cuestión

#### Vista cartelera:
Mostramos todas las películas disponibles, los próximos estrenos y otras películas especiales.
	- Películas en emisión
	- Estrenos
	- Detalles del cine (Podría llegar a ser una vista independiente)
		- Ubicación
		- Horarios
		- Instalaciones
		- Fotos

**Funcionalidad:**
- El usuario puede filtrar películas mediante una serie de filtros o búsqueda avanzada.
(Le cambiaría la vista con las películas que hagan match con la búsqueda. Paginación?)
- El usuario puede seleccionar la película deseada en esta vista. (Pasamos a [vista detalle película](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#vista-detalle-pelicula))

#### Vista detalle pelicula:
Se muestra información de la película como:
	- Título
	- Sinopsis
	- Duración
	- Tráiler
	- Género
	- Elenco de actores
	- Director

**Funcionalidad:**
- El usuario puede consultar los días (fechas) que está disponible la película
- El usuario selecciona el día que quiera ver la película. (Pasamo a vista de sesiones)

Vista sesiones: El usuario vería las sesiones disponibles para dicho día.
Funcionalidad:  El usuario selecciona la sesión. (Pasamos a [vista butacas](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#vista-butacas))

### PROCESO DE COMPRA

#### Vista butacas
El usuario vería una representación del cine, con las butacas disponibles y vacías.
- Butaca disponible (Gris)
- Butaca reservada (Rojo)
- Butaca seleccionada por ti (Verde)

**Funcionalidad:**
- El usuario selecciona un elemento butaca dentro del cine o varios
- Cuando el usuario confirma la selección, se comprueba la disponibilidad de la butaca
  - Si todo OK, continuaría la compra (Pasamos a [Vista compra](https://github.com/juanmiraaaa/ProyectoIntermodular?tab=readme-ov-file#vista-compra))
   - Si no, pedirá que selecciones otras butacas (Recarga la página)
- Las butacas seleccionadas en proceso de compra no estarán disponibles para que otros las puedan comprar durante un tiempo para evitar el overbooking.

#### VISTA COMPRA
