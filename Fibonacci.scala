 object Fibonacci extends App{
 val pos=3 //nth position 
 var first:Int=0 
 var second:Int=1
 var third:Int=0
 if(pos==1){
           println(s"element at $pos position is $first") //if position=1
           }
 else{
      for(i<-2 to pos-1){
                        third=first+second
                        first=second
                        second=third
                        }
      println(s"element at $pos position is $second")  //nth element
    }
                             }
