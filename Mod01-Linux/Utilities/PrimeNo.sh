echo "enter number";
read var;
counter=0;

for((x=2;x<var;x++))
do
	for((y=2;y<x;y++))
	do
		if [ $((x % y))  -eq 0 ]
		then
			counter=1;
		fi
	done
		if [ $counter -ne 1 ]
		then
			echo "$x";

		fi
		counter=0; 
done


