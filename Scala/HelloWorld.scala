import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object HelloWorld{
        def main(args: Array[String]){
                val conf = new SparkConf().setAppName("Hello World")
                val sc = new SparkContext(conf)
                println("Hello World!")
        }
}
