import scala.io.Source
val lines=Source.fromFile("test.scala").getLines.toList
val lines1=lines
val maxline=lines.reduce((x:String,y:String)=>if(x.length>y.length)x else y)
val max=lines.reduce((x:String,y:String)=>if(x.length>y.length)x else y).length
val minline=lines1.reduce((x:String,y:String)=>if(x.length<y.length)x else y)
for(line <- lines){
	var padding=max-line.length
	println("*"*padding+line)
}