#include<stdio.h>
int main()
{
    float value1,value2;
    char choice;
    printf("\n____________________________________________________________________________");

    printf("\n\n\t\t\t Simple Calculator ");
    printf("\n____________________________________________________________________________");

    printf("\n\n || Menu Options ||  ");
    printf("\n____________________________________________________________________________");
    printf("\n\n [+] - Addition");
    printf("\n\n [-] - Subtraction");
    printf("\n\n [/] - Division");
    printf("\n\n [*] - Multiplication");
    printf("\n____________________________________________________________________________");
    printf("\n\n Enter your Choice .... : ");
    scanf("%c",&choice);
    printf("\n____________________________________________________________________________");

    if(choice=='+' || choice=='-' || choice=='/' || choice=='*')
    {
        printf("\n\n Enter Value 1 : ");
        scanf("%f",&value1);

        printf("\n\n Enter Value 2 : ");
        scanf("%f",&value2);
    }

    printf("\n____________________________________________________________________________");

    if(choice=='+')
    {
        printf("\n\n Result        : %5.2f ",value1+value2);
    }
    else if(choice=='-')
    {
        printf("\n\n Result        : %5.2f ",value1-value2);
    }
    else if(choice=='/')
    {
        if(value2!=0)
        {
            printf("\n\n Result        : %5.2f ",value1/value2);
        }
        else
        {
            printf("\n\n Result        : CAN'T DIVIDE BY ZERO.");
        }
    }
    else if(choice=='*')
    {
        printf("\n\n Result        : %5.2f ",value1*value2);
    }
    else
    {
        printf("\n\n Result        : INVALID INPUT ! Please Lookup Menu Options....");
    }
    printf("\n____________________________________________________________________________");

    printf("\n\n");
    return 0;
}
