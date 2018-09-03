var=$1;
echo $(cat $var | tr '[a-z]' '[c-za-b]') >$1;

