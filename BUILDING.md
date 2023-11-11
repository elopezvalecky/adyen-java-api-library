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

## Generate Models & Services

> #### Work in Progress
> Its only cover the model generation of the following api specifications
> - BalanceControlService-v1
>
> This is only for the purpose of the assignment to show off my skills that it could be done via gradle as well

```shell
./gradlew openapiModelBalanceControlService-v1
```

