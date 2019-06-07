#include<stdio.h>
#include<conio.h>
void main()
{
int n;
clrscr();
scanf("%d",&n);
if(n<0)
{
printf("Negative");
}
else if(n>0)
{
printf("Postivie");
}
else
{
printf("Zero");
}
getch();
}
