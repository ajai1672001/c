
#include<stdio.h>
#include<conio.h>
void main()
{
int n;
clrscr();
scanf("%d",&n);
if (n>0)
{
if(n%2==0)
{
printf("Even");
}
else
{
printf("Odd");
}
}
else
printf("Invalid");
getch();
}
