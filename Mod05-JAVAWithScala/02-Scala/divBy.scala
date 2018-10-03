val x=10
val divBy=x match{
	case x if(x%2 == 0) => "Divisible by 2"
	case x if(x%3 == 0) => "Divisble by 3"
	case x if(x%5 == 0) => "Divisble by 5"
	case _ => "Not Divisible"
}
println(divBy);
