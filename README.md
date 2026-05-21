# FirmaDigREST 🚀

Actúa como una aplicación web desacoplada en Spring Boot. No duplica lógica criptográfica; simplemente toma la librería PKI como una dependencia local y la expone al mundo exterior a través de endpoints REST.

## 🏗️ Arquitectura y Diseño Modular
Este microservicio está diseñado bajo un enfoque de arquitectura limpia y separación de responsabilidades:

* **Capa de Exposición:** Spring Boot (REST API) encargada del transporte, validación de esquemas de entrada y contratos de servicios.
* **Cúcleo del Negocio:** No duplica código. Consume directamente los componentes de nuestra librería especializada independiente **[pki-core-firmas](https://github.com/TU_USUARIO/pki-core-firmas)**.

## 🛠️ Tecnologías
* Java
* Spring Boot
* Maven / Gradle
