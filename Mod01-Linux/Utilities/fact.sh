#Utility for finding Factorial
echo "enter number";
read var;
fact=1;
for((x=var ;x>0; x--))
do
	fact=$((fact*x));
done
echo "factorial: $fact";
