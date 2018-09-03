#include<stdio.h>
#include<stdlib.h>
int find_length(char string[]) {
    int len = 0,i;
    for (i = 0; string[i] != '\0'; i++) {
      len++;
    }
    return len;
  }
void join_strings(char string1[], char string2[]) {
    int i, len1, len2;
    len1 = find_length(string1);
    len2 = find_length(string2);
    for (i = len1; i < len1 + len2; i++) {
      string1[i] = string2[i - len1];
    }
    string1[i] = '\0'; //adding null character at the end of input
  }
  /*returns 0 if thery are same otherwise returns 1 and prints equal or not*/
int compare_strings(char string1[], char string2[]) {
  int len1, len2, i, count = 0;
  len1 = find_length(string1);
  len2 = find_length(string2);
  if (len1 != len2)
    return 1;
  for (i = 0; i < len1; i++) {
    if (string1[i] == string2[i])
      count++;
  }
  if (count == len1)
    return 0;
  return 1;
}
void copy_string(char destination[], char source[]) {
  int len, i;
  len = find_length(source);
  for (i = 0; i < len; i++) {
    destination[i] = source[i];
  }
  destination[i] = '\0';
}
/*Reverse function*/
int reverse()
{
   char s[1000], r[1000];int begin, end, count = 0;
   printf("Input a string\n");
   gets(s);
   while (s[count] != '\0')
      count++;
   end = count - 1;
   for (begin = 0; begin < count; begin++) {
      r[begin] = s[end];
      end--;
   }
   r[begin] = '\0';
   printf("%s\n", r);
}int main() {
  char string1[20], string2[20]; //string variables declaration with size 20
  int choice;
  while (1) {
    printf("\n1. Find Length \n2. Concatenate \n3. Compare \n4. Copy \n5. Reverse6. Exit\n");
    printf("Enter your choice: ");
    scanf("%d", & choice);
    switch (choice) {
    case 1:
      printf("Enter the string: ");
      scanf("%s", string1);
      printf("The length of string is %d", find_length(string1));
      break;
    case 2:
      printf("Enter two strings: ");
      scanf("%s%s", string1, string2);
      join_strings(string1, string2);
      printf("The concatenated string is %s", string1);
      break;
    case 3:
      printf("Enter two strings: ");
      scanf("%s%s", string1, string2);
      if (compare_strings(string1, string2) == 0) {
        printf("They are equal");
      } else {
        printf("They are not equal");
      }
      break;
    case 4:
      printf("Enter a string: ");
      scanf("%s", string1);
      printf("String1 = %s\n",string1);
      printf("After copying string1 to string 2\n");
      copy_string(string2, string1);
      printf("String2 = %s", string2);
      break;
    case 5:
      reverse();
      printf("The reverse of string is: %s",reverse());
    case 6:
      exit(0);
    }
  }
  return 0;
}
