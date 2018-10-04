

object AccountDemo {
  
  def main(args:Array[String])
  {
    val a1:Account=new SavingsAccount(1234,"abc",5000);
    a1.withdraw(6000);
    a1.withdraw(2000);
    println(a1)
    println("*"*50)
    val a2:Account=new CurrentAccount(1234,"abc",5000,2000);
    a2.withdraw(8000);
    a2.withdraw(2000);
    a2.withdraw(4000);
    println(a2);
    
  }
  
}