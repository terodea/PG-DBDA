abstract class Account(ano:Int,anm:String,bal:Double){
	private val accno:Int=ano
	private val name:String=anm
	protected var balance:Double=bal
	def this(ano:Int,anm:String)=this(ano,anm,1000)
	def withdraw(amt:Double)
	
}



