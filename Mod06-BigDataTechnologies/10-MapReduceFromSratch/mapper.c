#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define BUF_SIZE   2048
#define DELIM      "\n"
int main(int argc, char *argv[]){
 char buffer[BUF_SIZE];
 while(fgets(buffer, BUF_SIZE - 1, stdin)){
        int len = strlen(buffer);
        if(buffer[len-1] == '\n')
         buffer[len-1] = 0;
        char *querys  = index(buffer, ' ');
        char *query = NULL;
        if(querys == NULL) continue;
        querys += 1; 
        query = strtok(buffer, " ");
        while(query){
               printf("%s\t1\n", query);
               query = strtok(NULL, " ");
        }
 }
 return 0;
}
