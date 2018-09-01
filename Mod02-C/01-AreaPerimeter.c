#include <stdio.h>
#include <math.h>

int main()
{
    float radius, length, width, a, b, c, height;
    int n;
    float perimeter;

    //Perimeter of rectangle
    printf(" \n Perimeter of rectangle \n");
    printf("---------------------------\n");
    printf("\n Enter width and length of the rectangle : ");
    scanf("%f%f", &width,& length);
    perimeter = 2 * (width + length);
    printf("Perimeter of rectangle is: %.3f", perimeter);

    //Perimeter of triangle
    printf("\n Perimeter of triangle n");
    printf("---------------------------n");
    printf("\n Enter the size of all sides of the triangle : ");
    scanf("%f%f%f", &a, &b, &c);
    perimeter = a + b + c;
    printf("Perimeter of triangle is: %.3f", perimeter);

    //Perimeter of circle
    printf(" \n Perimeter of circle \n");
    printf("---------------------------\n");
    printf("\n Enter the radius of the circle : ");
    scanf("%f", &radius);
    perimeter = 2 * (22 / 7) * radius;
    printf("Perimeter of circle is: %.3f", perimeter);

    //Perimeter of equilateral triangle
    printf(" \n Perimeter of equilateral triangle \n");
    printf("---------------------------\n");
    printf("\n Enter any side of the equilateral triangle : ");
    scanf("%f", &a);
    perimeter = 3 * a;
    printf("Perimeter of equilateral triangle is: %.3f", perimeter);

    //Perimeter of right angled triangle
    printf(" \n Perimeter of right angled triangle \n");
    printf("---------------------------\n");
    printf("\n Enter the width and height of the right angled triangle : ");
    scanf("%f%f", &width, &height);
    perimeter = width + height + sqrt(width * width + height * height);
    printf("Perimeter of right angled triangle is: %.3f", perimeter);
    return 0;
  }
