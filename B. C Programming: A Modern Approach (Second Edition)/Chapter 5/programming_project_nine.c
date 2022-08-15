#include <stdio.h>

int main(void)
{
	int month1, month2, day1, day2, year1, year2;

	printf("Enter first date (mm/dd/yy): ");
	scanf("%d /%d /%d", &month1, &day1, &year1);

	printf("Enter second date (mm/dd/yy): ");
	scanf("%d /%d /%d", &month2, &day2, &year2);

	int i = (year1 >= year2) + (year1 == year2);
	switch (i)
	{
		case 0: printf("%.2d/%.2d/%.2d is earlier than %.2d/%.2d/%.2d.\n", month1, day1, year1, month2, day2, year2); break;
		case 1: printf("%.2d/%.2d/%.2d is earlier than %.2d/%.2d/%.2d.\n", month2, day2, year2, month1, day1, year1); break;
		case 2: 
		{
			i = (month1 >= month2) + (month1 == month2);
			switch (i)
			{
				case 0: printf("%.2d/%.2d/%.2d is earlier than %.2d/%.2d/%.2d.\n", month1, day1, year1, month2, day2, year2); break;
				case 1: printf("%.2d/%.2d/%.2d is earlier than %.2d/%.2d/%.2d.\n", month2, day2, year2, month1, day1, year1); break;
				case 2:
				{
					i = (day1 >= day2) + (day1 == day2);
					switch (i)
					{
						case 0: printf("%.2d/%.2d/%.2d is earlier than %.2d/%.2d/%.2d.\n", month1, day1, year1, month2, day2, year2); break;
                        case 1: printf("%.2d/%.2d/%.2d is earlier than %.2d/%.2d/%.2d.\n", month2, day2, year2, month1, day1, year1); break;
						case 2: printf("They are the same date.\n");
					}
				}
			}
		}
	}
}
