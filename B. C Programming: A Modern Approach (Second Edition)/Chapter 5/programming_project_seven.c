#include <stdio.h>

int main(void)
{
	int first, second, third, fourth, max1, min1, max2, min2;

	printf("Enter four integers: ");
	scanf("%d%d%d%d", &first, &second, &third, &fourth);

	// Comparing the two first numbers
	if (first >= second) {max1 = first; min1 = second;}
	else                 {max1 = second; min1 = first;}

        // Comparing the two last numbers
	if (third >= fourth) {max2 = third; min2 = fourth;}
	else                 {max2 = fourth; min2 = third;}

        // Comparing the two maximums and the two minimums
	if (max2 > max1) max1 = max2;
	if (min2 < min1) min1 = min2;

	// Printing the results
	printf("Largest: %d\nSmallest: %d\n", max1, min1);
}
