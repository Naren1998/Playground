#include <stdio.h>
#include <math.h> 
int main()
{
    int base, expo, power;
    scanf("%d", &base);
    scanf("%d", &expo);
    power = pow(base, expo);

    printf("%d",power);

    return 0;
}
  	