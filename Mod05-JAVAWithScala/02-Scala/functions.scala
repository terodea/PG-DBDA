def max(x:Int,y:Int):Int = if (x>y) x else y
val m =max(10,20)
println(m)

def start()=println("="*50 + "\n BMJ\n"+"="*50)
val t=start()
print(t)

def fact(x:Int)={
	var z=x;
	var f=1;
	while(z>0){
		f*=z;
		z-=1;
	}
f
}
val x=5;
val f=fact(x);
println(s"factorial of $x is $f")

