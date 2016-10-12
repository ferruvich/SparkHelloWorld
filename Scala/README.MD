
~~~~
  # Your directory layout should look like this
  $ find .
  .
  ./simple.sbt
  ./src
  ./src/main
  ./src/main/scala
  ./src/main/scala/HelloWorld.scala

  # Package a jar containing your application
  $ sbt package
  ...
  [info] Packaging {..}/{..}/target/scala-2.11/helloWorld_2.11-1.0.jar

  # Use spark-submit to run your application
  $ YOUR_SPARK_HOME/bin/spark-submit \
    --class "HelloWorld" \
    --master local[4] \
    target/scala-2.11/helloWorld_2.11-1.0.jar
~~~~
