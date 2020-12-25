/**
 * @Classname Day2
 * @Description TODO
 * @Date 2020/12/25 9:47
 * @Created by 85226
 */
import scala.collection.mutable.ArrayBuffer
object Day2 {
   def main(args:Array[String]):Unit={
      /*函数式编程,不需要指定返回值*/
      val add=(x:Int,y:Int)=>x+y
     print(add(1,2))
     /*数组*/
     val a=new Array[Int](10)
     println(a(5))
     var b=Array("hadoop","spark","Flink")
     println(b(2))
     b(2)="Hive"
     println(b(2))
     /*边长数组*/
     var c = ArrayBuffer[Int]()
     c+=0
     println(c)
     c++=a
     println(c)

     val arr=Array(1,9,6,5,7,6)
     println(arr.sum)
     println(arr.sorted)

     val map=(1,"a",2,"b")
     print(map)
     print(map._1)


     /*函数式编程，在spark和flink大量用到*/
     val list=List(1,2,3,4,5)
     list.foreach((x)=>println(x))
     val k=list.map(x=>x*10)
     println(k)
     val f=List("Hello world","Big Data")
     f.flatMap(x=>x.split(" "))
     val l=list.filter(x=>x>=3)
      println(l)
     val list1=List("1 hadoop","2 spark","3 flink")
     list1.sortBy(x=>x.split(" ")(1))
   }
}
