import scala.io.Source._


var i =1;
var l1:List[String]=List()
val lines=scala.io.Source.fromFile("test.scala").getLines().toList

//for(line <- lines){
//	l1=l1:+(line)	
//}
var max=""
var min=""

for(i<- lines){
	//min=i
	//for(j<- lines.range(2,length(lines)){
		//if(i.length > j.length){

			if(i.length > max.length) max=i 
			if(i.length < min.length) min=i	
		}
println(max)
println(min)
