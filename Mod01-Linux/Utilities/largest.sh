if [ -e tempfile ]
then 
	rm tempfile;
fi

var=$(cat line.txt | wc -l);

for((i=1; i<=3; i++))
do
	line=$(head -n $i line.txt | tail -n 1);
	echo ${#line};
	
	
done

#cat tempfile |sort -nr |head -1;

