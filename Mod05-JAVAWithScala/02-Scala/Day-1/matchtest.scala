val status=500
val msg=status match{
	case 200 => "Case 200"
	case 300 => "Case 300"
	case 400 => "Case 400"
	case x => s"$x is Invalid Status"
}
println(msg);
