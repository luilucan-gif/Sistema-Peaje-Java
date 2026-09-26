# Sistema de Peaje en Java

Sistema de gestión de peaje desarrollado en Java aplicando los principios de la Programación Orientada a Objetos (POO).

## 📋 Descripción

Este proyecto simula el funcionamiento básico de una estación de peaje. El sistema permite registrar diferentes tipos de vehículos y calcular el valor del peaje correspondiente según el tipo de vehículo.

El proyecto fue desarrollado como parte de mi formación en Ingeniería en Inteligencia Artificial, con el objetivo de aplicar conceptos de programación orientada a objetos en Java.

## 🚗 Tipos de vehículos

El sistema trabaja con diferentes tipos de vehículos:

- Carros
- Motos
- Camiones

Cada tipo de vehículo es representado mediante una clase específica que hereda de la clase `Vehiculo`.

## ⚙️ Funcionalidades

- Registro de vehículos.
- Identificación mediante placa.
- Diferenciación entre carros, motos y camiones.
- Cálculo del valor del peaje.
- Registro de vehículos que pasan por la estación.
- Cálculo del total recaudado.
- Uso de herencia y clases para organizar el sistema.

## 🧩 Estructura del proyecto

El proyecto está compuesto por las siguientes clases:

- `Vehiculo.java` — Clase base para los vehículos.
- `Carro.java` — Representa un automóvil.
- `Moto.java` — Representa una motocicleta.
- `Camion.java` — Representa un camión.
- `Peaje.java` — Gestiona las operaciones de la estación de peaje.
- `SistemaPeaje.java` — Clase principal para ejecutar el programa.

## 🛠️ Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Visual Studio Code
- Git
- GitHub

## 🎯 Conceptos aplicados

Durante el desarrollo del proyecto se aplicaron conceptos como:

- Clases y objetos
- Herencia
- Encapsulamiento
- Constructores
- Métodos
- Colecciones de objetos
- Organización del código en múltiples clases

## ▶️ Ejecución

Para compilar el proyecto:

```bash
javac *.java
