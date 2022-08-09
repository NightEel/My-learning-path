#include <stdio.h>

int main(void)
{
    float   x;
    printf("Give me a float: ");
    scanf("%f", &x);

    printf("(a) %-8.1e\n",x);
    printf("(b) %10.6e\n",x);
    printf("(c) %-8.3f\n",x);
    printf("(d) %6.0f\n",x);
}
