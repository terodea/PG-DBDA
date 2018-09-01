#include<stdio.h>
int main(){
	int marks[5],i,sum=0;
	for(i=0;i<5;i++){
		printf("\nEnter the %d elements",i + 1);
		scanf("%d",&marks[i]);
		sum+=marks[i];
	}
	printf("\nThe sum of the array is : %d",sum);
	printf("\nThe average of the array is %f",(float)sum/5);
	return 0;
}

