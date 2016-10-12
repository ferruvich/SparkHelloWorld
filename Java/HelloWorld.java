import org.apache.spark.api.java.*;
import org.apache.spark.SparkConf;

public class HelloWorld{
        public static void main(String[] args){
                SparkConf conf = new SparkConf().setAppName("Hello World");
                JavaSparkContext sc = new JavaSparkContext(conf);
                System.out.println("Hello World!");
        }
}
