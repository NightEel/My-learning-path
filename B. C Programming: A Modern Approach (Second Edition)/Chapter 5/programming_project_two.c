#include <stdio.h>

int main(void)
{
	int hours24, hours12, minutes;

	printf("Enter a 24-hour time: ");
	scanf("%d :%d", &hours24, &minutes);

	if ((hours24 > 23) || (hours24 < 0) || (minutes > 60) || (minutes < 0)) printf("Please, enter a valid 24-hours time.\n");
	else 
	{
		if      (hours24 == 0)  hours12 = 12;
		else if (hours24 <= 12) hours12 = hours24;
		else 		            hours12 = hours24 - 12;

		printf("Equivalent 12-hour time: %.2d:%.2d", hours12, minutes);
		if (hours24 < 12) printf(" AM\n");
		else 		      printf(" PM\n");
	}
}
