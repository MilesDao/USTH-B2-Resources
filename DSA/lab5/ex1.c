/*
Exercise 1: This problem, we would like to study a sorting algorithm for a given
array of n elements with the following steps:
 Find the maximum element position (denoted by max) from 0 to n-1.
 Flip all elements from the position 0 to max. (Flip means reverse, e.g: flipping
(1, 0, 3) = (3, 0, 1)).
 Flip the whole unsorted array. Now the maximum is found at the end of the
unsorted array and the last element or the maximum is sorted.
 Repeat this process until all elements are sorted.
 Write a program to complete the above algorithm.
 Calculate the complexity of your program (Best scenario, Worst scenario, Average).
*/
int findMax(int a[], int n)
{
    int pos = 0;
    for (int i = 1; i < n; i++)
    {
        if (a[i] > a[pos])
        {
            pos = i;
        }
    }
    return pos;
}
void flip(int a[], int i)
{
    int start = 0;
    while (start < i)
    {
        int temp = a[start];
        a[start] = a[i];
        a[i] = temp;
        start++;
        i--;
    }
}

void pancakesort(int *a, int n)
{
    for (int i = n; i > 1; --i)
    {
        int posMax = findMax(a, i);
    }
}
int main()
{

    return 0;
}