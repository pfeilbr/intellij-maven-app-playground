# intellij-maven-app-playground

example of IntelliJ Maven App

## Resources

* [Apache Maven Assembly Plugin / Usage](https://maven.apache.org/plugins/maven-assembly-plugin/usage.html)
---

```sh
# clean
mvn clean

# package with all dependencies and make .jar executable
# see `pom.xml` for details
mvn package

# run jar
java -jar ./target/app01-1.0-SNAPSHOT-jar-with-dependencies.jar
```