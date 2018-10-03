val day = "Sunday"
val dayType =day match
{
	case "Monday"|"Tuesday"|"Wednesday" => "Weekday"
	case "Saturday"|"Sunday" => "Weekend"
}
println(dayType);
