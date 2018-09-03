echo "enter the directory:";
read dirfile;
echo "enter the word to search";
read word;


for var in $(ls $dirfile)
do
	grep "$word" $dirfile/$var >/dev/null;
	if [ $? -eq 0 ]
	then
		echo "$var";
	fi
		
done
