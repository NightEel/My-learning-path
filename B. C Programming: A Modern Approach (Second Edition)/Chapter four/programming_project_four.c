#include <stdio.h>

int main(void)
{
	int decimal, octal;

	printf("Enter a number between 0 and 32767: ");
	scanf("%d", &decimal);

	octal	=	decimal % 8;
	decimal	=	decimal / 8;
	octal   +=  10 * (decimal % 8);
    decimal =   decimal / 8;
	octal   +=  100 * (decimal % 8);
    decimal =   decimal / 8;
	octal   +=  1000 * (decimal % 8);
    decimal =   decimal / 8;

	printf("In octal, your number is: %.5d\n", octal);
}
