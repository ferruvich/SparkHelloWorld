~~~~
#Your target directory should be like this
  $ find .
  ./pom.xml
  ./src
  ./src/main
  ./src/main/java
  ./src/main/java/HelloWorld.java

  # Package a JAR containing your application
  $ mvn package
  ...
  [INFO] Building jar: {..}/{..}/target/helloWorld-1.0.jar

  # Use spark-submit to run your application
  $ YOUR_SPARK_HOME/bin/spark-submit \
    --class "HelloWorld" \
    target/helloWorld-1.0.jar
~~~~
