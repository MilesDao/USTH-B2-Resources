/*
Exercise 2:
Complete this given function void findMax(int *max, int a), which assigns a value
a to max if a > max.
*/
#include <stdio.h>
void findMax(int *max, int a)
{
    if (*max < a)
    {
        *max = a;
    }
}
int main()
{
    int n, a;
    scanf("%d", &n);
    int max = -2147483647;
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a);
        findMax(&max, a);
    }
    printf("max = %d", max);

    return 0;
}