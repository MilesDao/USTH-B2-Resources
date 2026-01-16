// linear search

int search(int a[], int x, int n)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] == x)
            return i;
    }
    return -1;
}
int isEmpty(int a[])
{
    if (sizeof(a) == 0)
        return 1;
    return 0;
}
// liear search recursive
int search1(int a[], int x, int i)
{
    if (isEmpty(a))
        return -1;
    if (a[i] == x)
        return 1;
    return search1(a, x, i++);
}