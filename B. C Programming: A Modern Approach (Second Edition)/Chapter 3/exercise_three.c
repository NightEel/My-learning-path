#include <stdio.h>

int main (void)
{
	int	a1, a2, b11, b12, b13, b21, b22, b23;
	float	c1, c2, d11, d12, d21, d22;

	printf("Give me a1: ");
	scanf("%d", &a1);
	printf("Give me a2: ");
	scanf(" %d", &a2);
	printf("a1 = %d, a2 = %d.\n", a1, a2);

	printf("Give me b11, b12 and b13: ");
	scanf("%d-%d-%d", &b11, &b12, &b13);
	printf("Give me b21, b22 and b23: ");
	scanf("%d -%d -%d", &b21, &b22, &b23);
	printf("b11 = %d, b12 = %d, b13 = %d.\nb21 = %d, b22 = %d, b23 = %d.\n", b11, b12, b13, b21, b22, b23);
	
	printf("Give me c1: ");
	scanf("%f", &c1);
	printf("Give me c2: ");
	scanf("%f ", &c2);
	printf("c1 = %f, c2 = %f.\n", c1, c2);
	
	printf("Give me d11 and d12: ");
	scanf(".%f,%f", &d11, &d12);
	printf("Give me d21 and d22: ");
	scanf("%f, %f", &d21, &d22);
	printf("d11 = %f, d12 = %f.\nd21 = %f, d22 = %f.\n", d11, d12, d21, d22);
}
