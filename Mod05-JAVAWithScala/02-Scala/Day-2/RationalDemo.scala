class Rational(n:Int,d:Int){
	require(d != 0)
	val num:Int=n
	val den:Int=d
	println("OBJECT Created")
	
	def this(x:Int)=this(x,1)
	
	override def toString()=n+"/"+d
	
	def +(x:Rational):Rational={
		new Rational(this.num*x.den+x.num*this.den,this.den*x.den)
	}
	def +(x:Int):Rational={
		new Rational(this.num+this.den*x,this.den)
	}
	def *(x:Rational):Rational={
		new Rational(this.num*x.num,this.den*x.den)
	}
	def <(x:Rational):Boolean={
		if(this.num/this.den < x.num/x.den){
			true
		}
		else{
			false
		}
	}
}

object RationalDemo{
	def main(args:Array[String]){
		val r1:Rational = new Rational(3,4)
		println(r1)

		val r2:Rational = new Rational(5)
		println(r2)

		val r4=r1+r2
		println(r4)

		val r5=r1*r2
		println(r5)

		val r6=r1 + 3
		println(r6)

		if(r1 < r2){
			println(r1+" is smaller than "+r2)
		}
		else{
			println(r1+" is greater than "+r2)
		}
	}
}