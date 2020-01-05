//maitrise de l'allocation simple en C

#include<stdlib.h>
#include<conio.h>
#include<stdio.h>

int main()
{
	 int val = 10;
     int *ptr = &val;
     printf("%d", *ptr);
}
