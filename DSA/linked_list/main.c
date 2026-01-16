#include <stdio.h>
#include <stdlib.h>
typedef struct Node
{
    int x;
    struct Node *next;

} Node;

int main()
{
    // Node root, element2;
    // root.x = 200;
    // root.next = &element2;
    // element2.x = -10;
    // element2.next = NULL;
    // printf("%d\n", root.x);
    // printf("%d\n", root.next->x);
    // printf("%d\n", element2.x);
    Node root;
    root.x = 200;
    root.next = malloc(sizeof(Node));
    root.next->x = -20;
    root.next->next = NULL;
    printf("%d\n", root.x);
    printf("%d\n", root.next->x);
    return 0;
}