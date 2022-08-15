#include <stdio.h>

int main(void)
{
	int n	= 1; // n initialized here just in case the "random" default initialization of n is 0
	int sum = 0;

	printf("This program sums a series of integers.\n");
	printf("Enter integers (0 to terminate): ");

	while (n != 0)
	{
		scanf("%d", &n);
		sum += n;
	}

	printf("The sum is: %d\n", sum);
}
