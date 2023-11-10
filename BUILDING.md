## Building from Source

It is not required to build this library from the source code, but if you want to try out the latest and the greatest, it can be built and published into your Local maven repository via gradle wrapper.

```shell
./gradlew clean publishToMavenLocal
```

This will build all jars and documentation and publish them to your local Maven repository. It won’t run any of the tests. If you want to build everything, use the `build` task:

```shell
./gradlew clean build
```

--- 
