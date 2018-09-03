echo "enter filename: ";
read filename;
	
echo "numbers : $(grep -o "[0-9]" $filename |wc -l)";
