# robo-app

Para executar o projeto é necessário compilar e criar o jar através dos seguintes comandos:

```
kotlinc src/main/kotlin/robo/*.kt src/main/kotlin/Main.kt -include-runtime -d robo.jar
```
E depois:
```
java -jar robo.jar
```
