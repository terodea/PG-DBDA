import scala.io.StdIn._

var l1:List[Int]=List()

for(i <- 1 to 5){
	println("Enter any number")
	val num =readInt()
	l1=l1:+(num) //elements are appended
	//l1=num::l1 //elements are prepended
	//l1=l1
}
println(l1)


def mySumFn(i:Int,j:Int):Int={
	//val sum
	//sum=i+j
	println("sum of "+i+" and "+j+" is",+(i+j))
	//sum
	i+j
}

println(l1.reduce(mySumFn))