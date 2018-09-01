#include<stdio.h>
int main(){
int marks;
printf("Enter the marks");
scanf("%d",&marks);
	if(marks >= 60){
		printf("You have A grade.");
	}
	if(marks >=50 && marks <60){
		printf("You have B grade");
	}
	if(marks <50 && marks >=40){
		printf("You have C grade");
	}
}



