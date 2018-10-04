import scala.util.control.Breaks._
def isSorted(arr:Array[Int]):Boolean =
	{
		var flag = true
		breakable 
		{
			for(i<- 0 until arr.length-1)
			{
				if(arr(i) > arr(i+1))
				{
					flag=false
					break
				}
			}
		}
		flag
	}
val numbers: Array[Int] =Array(2,6,3,5,9)
val numbers1: Array[Int]=new Array(5)
numbers1(0)=1
numbers1(1)=2
numbers1(2)=3
numbers1(3)=4
numbers1(4)=5
val f=isSorted(numbers)
println(f)
val f1=isSorted(numbers1)
println(f1)
