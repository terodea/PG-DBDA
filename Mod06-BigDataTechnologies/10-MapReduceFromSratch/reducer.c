#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define BUFFER_SIZE     1024  
#define DELIM   "\t"
int main(int argc, char *argv[]){
 /*
  Reducer Component of Hadoop Map Reduce
 */
char strLastKey[BUFFER_SIZE];
 char strLine[BUFFER_SIZE];
 int count = 0;
 *strLastKey = '\0';
 *strLine = '\0';
 while( fgets(strLine, BUFFER_SIZE - 1, stdin) ){
 char *strCurrKey = NULL;
 char *strCurrNum = NULL;
 strCurrKey  = strtok(strLine, DELIM);
 strCurrNum = strtok(NULL, DELIM); 
 if( strLastKey[0] == '\0'){
  strcpy(strLastKey, strCurrKey);
 }
 if(strcmp(strCurrKey, strLastKey)) {
 printf("%s\t%d\n", strLastKey, count);
 count = atoi(strCurrNum);
 } else {
 count += atoi(strCurrNum);
}
 strcpy(strLastKey, strCurrKey);
 }
 printf("%s\t%d\n", strLastKey, count); 
 return 0;
}
