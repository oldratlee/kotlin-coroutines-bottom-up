# A Bottom-Up View of Kotlin Coroutines

<img src="kotlin-coroutines.png" vspace="10px" hspace="10px" align="right" width="25%" >

[![Github Workflow Build Status](https://img.shields.io/github/actions/workflow/status/oldratlee/kotlin-coroutines-bottom-up/ci.yaml?branch=master&logo=github&logoColor=white)](https://github.com/oldratlee/kotlin-coroutines-bottom-up/actions/workflows/ci.yaml)
[![Java support](https://img.shields.io/badge/Java+fx-11+-green?logo=OpenJDK&logoColor=white)](https://openjdk.java.net/)
[![License](https://img.shields.io/badge/license-Apache%202-4D7A97.svg?logo=Apache&logoColor=white)](https://www.apache.org/licenses/LICENSE-2.0.html)

Complete runnable demo code of the article [A Bottom-Up View of Kotlin Coroutines](https://www.infoq.com/articles/kotlin-coroutines-bottom-up/) - _Garth Gilmour_ / _Eamonn Boyle_，2020-01-11.

PS: My [Chinese translation](https://github.com/oldratlee/translations/blob/master/kotlin-coroutines-bottom-up/README.md) of this article.

## Pre requirements

- `JDK 11+`
- `JDK` bundle with `JavaFX`

> The simple way to install required `JDK` is using [**_`SDKMAN`_**](https://sdkman.io/install):
>
> ```ruby
> sdk install java 11.0.14.fx-zulu
> ```

## Run Server

```sh
./mvnw compile -pl server exec:java -Dexec.mainClass=com.oldratlee.demo.koroutines_bottom_up.server.ServerMainKt
```

## Run Client

```sh
./mvnw compile -pl client exec:java -Dexec.mainClass=com.oldratlee.demo.koroutines_bottom_up.client.MyAppKt
```
