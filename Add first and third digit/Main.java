#include<stdio.h>
int main()
{
  //Type your code here
  int first,third,n,sum;
  scanf("%d",&n);
  first =n/100;
  third =n%10;
  sum=first+third;
  printf("%d",sum);
  return 0;
}