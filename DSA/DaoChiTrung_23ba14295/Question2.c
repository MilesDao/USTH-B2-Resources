#include <stdio.h>
#include <stdio.h>

int searchBlock(int arr[], int x, int first, int last, int nblocks)
{
    if (first > last)
        return -1;

    if (last - first + 1 <= nblocks)
    {
        for (int i = first; i <= last; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    int len = (last - first + 1) / nblocks;
    if (len == 0)
        len = 1;

    for (int i = 0; i < nblocks; i++)
    {
        int start = first + i * len;
        int end = start + len - 1;
        if (end > last)
            end = last;

        if (arr[start] <= x && x <= arr[end])
        {
            return searchBlock(arr, x, start, end, nblocks);
        }
    }

    return -1;
}

int main()
{
    int arr[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 7;
    int nblocks = 3;
    int result = searchBlock(arr, x, 0, n - 1, nblocks);
    if (result != -1)
        printf("Index: %d\n", result);
    else
        printf("Not found\n");
    return 0;
}
/*
Time Complexity of these function:
O(k * log_k(n))
   - Each level pass to k blocks
   - The Eecursion is log_k(n)

=> the Binary Search is still faster when k > 2
because
Time complexity of Binary Search O is (log n)
   - Divides into 2, checks 1

*/
