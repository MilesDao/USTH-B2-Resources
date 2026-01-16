/*
Exercise 3:
Write a structure to represent complex numbers and complete operators: add and
multiply
*/
#include <stdio.h>
struct complex
{
    double real, img;
};

typedef struct complex Com;

void input(Com *x)
{
    scanf("%lf %lf", &x->real, &x->img);
}
void print(Com x)
{
    printf("(%.2lf) + (%.2lf)i\n", x.real, x.img);
}
Com add(Com x1, Com x2)
{
    Com res;
    res.real = x1.real + x2.real;
    res.img = x1.img + x2.img;
    return res;
}
Com mul(Com x1, Com x2)
{
    Com res; // x1 = a+bi, x2 = c+di, x1*x2 = a*c + a*di + bi*c - bd;
    res.real = x1.real * x2.real - x1.img * x2.img;
    res.img = x1.real * x2.img + x1.img * x2.real;
    return res;
}
int main()
{
    Com x1, x2;
    printf("input x1 = \n");
    input(&x1);
    printf("input x2 = \n");
    input(&x2);
    printf("x1 = ");
    print(x1);
    printf("x2 = ");
    print(x2);
    Com sum = add(x1, x2);
    Com nhan = mul(x1, x2);
    printf("sum = (%.2lf) + (%.2lf)i\n", sum.real, sum.img);
    printf("mul = (%.2lf) + (%.2lf)i\n", nhan.real, nhan.img);
    return 0;
}