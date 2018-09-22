# Utility for finding all extension files
if [ -e tempfile ]
then 
	rm tempfile;
fi

for extension in $(find -type f -name "*.*" | awk -F . '{print $3}')
do 
	echo $extension >> tempfile;
done
	sort tempfile | uniq -c | awk '{print $1 " ."$2 " files"}';

#var=$(find . -type f -not -name "*.*" | wc -l);
echo "$(find . -type f -not -name "*.*" | wc -l)  no extension files";
