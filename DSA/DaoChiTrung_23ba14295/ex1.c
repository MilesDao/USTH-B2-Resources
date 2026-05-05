#include <stdio.h>

typedef struct
{
    int prime;
    int power;
} PrimeFactor;

void initPrimeFactor(PrimeFactor *pf, int prime, int power)
{
    pf->prime = prime;
    pf->power = power;
}

int isprime(int n)
{
    if (n < 2)
        return 0;
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i == 0)
            return 0;
    }
    return 1;
} // O(sqrt(n))

void primefactorization(int n)
{
    PrimeFactor factors[100];
    int count = 0;

    // O(n * sqrt(n)) - outer loop O(n), isprime() O(sqrt(n))
    for (int i = 2; i <= n; i++)
    {
        if (isprime(i))
        {
            int power = 0;
            while (n % i == 0) // O(log n)
            {
                n /= i;
                power++;
            }
            if (power > 0)
            {
                initPrimeFactor(&factors[count], i, power);
                count++;
            }
        }
    }

    // O(k) - k = number of distinct prime factors
    for (int i = 0; i < count; i++)
    {
        printf("%d^%d", factors[i].prime, factors[i].power);
        if (i < count - 1)
            printf(" * ");
    }
    printf("\n");
}

/*
Total Time Complexity: O(n sqrt(n))
   - primefactorization loop: O(n)
   - isprime() called in loop: O(sqrt(n))
   - Combined: O(n * sqrt(n))
   - Output loop: O(k) where k <= log(n), negligible
*/

int main()
{
    PrimeFactor pf;

    int n = 360;
    printf("PrimeFactor of %d is: ", n);
    primefactorization(n);
    return 0;
}
