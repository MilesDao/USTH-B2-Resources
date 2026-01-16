/*Exercise 1:
Write a pseudocode and implement a program in C to swap the first and last digits
of a positive integer.*/
#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    // 4567 - 7564
    int temp = n;
    int last = temp % 10; // 7
    int check = 1;
    // 4
    while (temp >= 10)
    {
        temp /= 10;
        check *= 10;
    }
    int first = temp; // 4

    if (check == 1)
        printf("%d", n);
    else
    {
        int middle = n % check; // bo so dau
        middle = middle / 10;
        printf("%d", last * check + middle * 10 + first);
    }

    return 0;
}