class MainClass
{ 
def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int)=f(first,second) //High Order Function 
}
object AreaShapes extends App 
{
val mc=new MainClass
var shape="rhombus"
shape match{
case "parallelogram" =>val parallelogramArea = mc.area(shape,5,6,(l,b)=>l*b/2)
println(s"Area of parallelogram is $parallelogramArea")

case "rhombus" =>val rhombusArea = mc.area(shape,5,6,(b,h)=>b*h)
println(s"Area of parallelogram is $rhombusArea")

case "rectangle" =>val rectangleArea = mc.area(shape,5,6,(b,h)=>b*h)
println(s"Area of parallelogram is $rectangleArea")

case _ => println("Invalid Input")
}
}
