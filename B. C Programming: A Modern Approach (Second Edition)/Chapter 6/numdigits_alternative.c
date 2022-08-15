#include <stdio.h>

int main(void)
{
	int digits = 1; // Because any integer has at least one digit
	int n;

	printf("Enter any integer: ");
	scanf("%d", &n);

	while (1)
	{
		if (n / 10 == 0) break;
		else 
		{
			n /= 10;
			digits++;
		}
	}

	printf("The number has %d digit(s).\n", digits);
}
