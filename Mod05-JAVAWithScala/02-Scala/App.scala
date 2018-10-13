import scala.annotation.tailrec
object Fibonacci extends App {
   val zero = BigInt(0)
   def fibTail(n: Long): BigInt = {
    if (n <= 1) return 1 
    @tailrec
    def fibRecursion(a: BigInt, b: BigInt, n: BigInt): BigInt = {
      n match{
        case `zero` => b 
        case _ => fibRecursion(b, a + b, n - 1)
      }    
    }
    fibRecursion(1, 1, n - 2)  
  }
  def fibSeries(n: Long) = (1L to n).map (n => fibTail(n))
  fibSeries(readInt()).foreach {x => print(x + ", ") }
}