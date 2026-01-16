/*Exercise 4:
Write a pseudo-code by commenting in the file then implement a program in to
enter a natural number n and verify whether n is sphenic. Calculate the complexity
of your program.
Note: A sphenic number is a product of p*q*r where p, q, and r are three distinct
prime numbers. Example: 30 = 2 * 3* 5; 42 = 2*3*7; 66 = 2*3*11
*/
#include <stdio.h>
int prime(int n)
{
    if (n <= 1)
        return 0;
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i == 0)
            return 0;
    }
    return 1;
}
int sphenic(int n)
{
    int count = 0;
    for (int i = 2; i <= n; i++)
    {
        if (prime(i) && n % i == 0)
        {
            count += 1;
            n /= i;
            if (n % i == 0)
                return 0;
        }
    }
    return (count == 3 && n == 1);
}
int main()
{
    int n;
    scanf("%d", &n);
    if (sphenic(n))
    {
        printf("Yess");
    }
    else
    {
        printf("Noooo");
    }

    return 0;
}