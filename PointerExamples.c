#include<stdio.h>
void main()
{
    int x=5;
    int*p=&x;
    int **q=&p;
    int ***r=&q;
    printf("x = %d\n",x);
    printf("&x = %d\n",&x);
    printf("&p = %d\n",&p);
    printf("p = %d\n",p);
    printf("*p = %d\n",*p);
    printf("&q = %d\n",&q);
    printf("q = %d\n",q);
    printf("*q = %d\n",*q);
    printf("**q = %d\n",**q);
    printf("r = %d\n",r);
    printf("*r = %d\n",*r);
    printf("**r = %d\n",**r);
    printf("***r = %d\n",*(*(*r)));
}
