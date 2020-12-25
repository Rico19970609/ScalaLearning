/**
 * @Classname Day1
 * @Description TODO
 * @Date 2020/12/25 8:41
 * @Created by 85226
 */
object Day1 {
    /*Unit相当于void NUll代表对象的空值*/
      def main(args:Array[String]):Unit={
        //1.盘古开天劈地
        // println("hello,world!!!");
        //变量的声明
        val x:Int=1
        val y:Int=2
        println(x+y)
        //if表达式
        val x1:Int=if(x>0) 1 else -1
        println(x1)
        println(test(x1))

        /**循环表达式*/
        val list=1 to 10
        for(l<-list){
          print(l)
        }
        /*双重循环*/
        for(i<- 1 to 9;j<- 1 to i){
          println(i*j)
        }

        /*循环的守卫*/
        for(i<- 1 to 10 if i>5){
          println(i)
        }

        /*循环构建出一个集合*/
        val v= for(i<- list) yield i*10
        println(v)
        var b=1
        /*while循环表达式*/
        while(b<15){
          b=b+1
        }
        println(b)
        println(add(x,y))
        println(add(1,2,3))
      }

      /*块表达式的最后一个值就是返回值*/
      def test(x:Int):Int={
        x
      }
     /*方法的定义*/
     def add(x:Int,y:Int):Int={
       x+y
     }
    /*变长的参数*/
     def add(x:Int*):Int={
       var res=0
       for(i<-x){
         res+=i
       }
       res
     }
}
