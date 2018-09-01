#include<stdio.h>
int main(){
	int i,f,r,number,sum=0,temp;
	printf("Enter a number \n");
	scanf("%d",&number);
	temp=number;
	while(number){
		i=1,f=1;
		r=number % 10;
		while(i<=r){
			f*=i;
			i++;
		}
		sum+=f;
		number/=10;
	}
	if(sum==temp)
		printf("%d is a strong number\n",temp);
	else
		printf("%d is not a strong number\n",temp);
	return 0;
}
