object SumOfLists extends App{

val listOne=List(1,2,3,4) // first list 
val listTwo=List(2,2,2,2) // second list
val ln=listOne.length //length of Lists
var sum=for{i<-0 to ln-1 
           sum1=listOne(i)+listTwo(i)
           } yield sum1 
println(sum)
}
