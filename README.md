## Pokedex MVC (Java)

Ejemplo simple de una pequeña aplicación Pokedex organizada con el patrón MVC (Model-View-Controller).

Estructura de carpetas

- `src`: código fuente Java
- `lib`: dependencias externas (si las hay)

Compilar y ejecutar

Compilar y ejecutar desde la línea de comandos (requiere JDK instalado):

```bash
javac -d bin src/*.pokedexProj src/model/*.pokedexProj src/controller/*.pokedexProj src/view/*.pokedexProj
pokedexProj -cp bin App
```

La aplicación arranca con algunos Pokemons de ejemplo y muestra un menú interactivo por consola.

Archivos relevantes

- App.java: punto de entrada y configuración del MVC
- src/model: `Pokemon`, `Pokedex`
- src/controller: `PokedexController`
- src/view: `PokedexView`

Licencia

Este proyecto es un ejemplo educativo.
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
