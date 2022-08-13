#include <stdio.h>

int main(void)
{
	int number, digits;

	printf("Enter a number: ");
	scanf("%d", &number);

	if      (number / 10 == 0)    digits = 1;
	else if (number / 100 == 0)   digits = 2;
	else if (number / 1000 == 0)  digits = 3;
	else                          digits = 4;

	printf("The number %d has %d digits.\n", number, digits);
}
