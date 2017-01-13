
object SumOfProductDigits extends App{
                       val input=3 // user input upto n
                       var product=1
                       var sum1=0
                       //Function for calculating sum of digits 
                       def sum(inputProduct:Int):Int={
                                           var rem=0
                                           if(inputProduct>9){
                                                   rem=inputProduct%10
                                                   sum1=sum1+rem
                                                   sum(inputProduct/10) //recursion till input is > 9
                                                  }
                                           else 
                                                   sum1+inputProduct
                                           }
                       //Calculate product from 1 to input                    
                       for(i<-1 to input){
                                          product=product*i
                                         }
                      
                       val result=sum(product)
                       println(s"Sum of digits of product from 1 to $input is $result")
                       }
