// Computes the dimensional weight of a
// box from input provided by the user

#include <stdio.h>

int main(void)
{
  // Declaring variables
  int height, length, width;

  // Reading inputs
  printf("Enter height of box: ");
  scanf("%d", &height);
  printf("Enter the length of the box: ");
  scanf("%d", &length);
  printf("Enter the width of the box: ");
  scanf("%d", &width);

  // Computing volume
  int volume = height * length * width;

  // Printing the volume and the dimensional weight of the box
  printf("Volume (cubic inches): %d\n", volume);
  printf("Dimensional weight (pounds): %d\n", (volume + 165) / 166);

  return 0;
}
