echo "enter number";
read var;
counter=0;
var1=$((var/2));
for((x=2;x<var1;x++))
do
	if [ $((var % x)) -eq 0 ]
	then
		counter=1;
	fi
done
if [ $counter -eq 1 ]
then
	echo "not prime";
else
	echo "prime";
fi 

