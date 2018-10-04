import scala.io.Source

val lines=Source.fromFile("test.scala").getLines.toList
val lines1=lines
val maxline=lines.reduce((x:String,y:String)=>if(x.length>y.length)x else y)
val minline=lines1.reduce((x:String,y:String)=>if(x.length<y.length)x else y)
println("line with max no of chars "+maxline.length+"\n"+maxline)
println("line with min no of chars "+minline.length+"\n"+minline)