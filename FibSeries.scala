import scala.annotation.tailrec
object FibSeries extends App
{
val input=5
var first=0
var second=1
var term=input
@tailrec
def fib(x:Int,y:Int,z:Int){
require(z>0)
if(z==1)
println(x)
else{
println(x)
fib(y,x+y,z-1)
}
}
fib(first,second,input)

}
