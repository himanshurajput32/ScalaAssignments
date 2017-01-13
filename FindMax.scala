object FindMax extends App{
val list=List(1,3,2,68,34,99,33)
var max=list(1)
for(ls<-list){
              if(max<ls)
                 max=ls
             }
println(s"Maximum Element is = $max")
                          }
