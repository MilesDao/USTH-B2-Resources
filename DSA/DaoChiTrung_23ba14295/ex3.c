/*
1.Data Structure:
struct Node{char c; Node *lelf; Node *right; };*/
#include <stdio.h>
#include <stdlib.h>

struct Node
{
    char c;
    struct Node *left;
    struct Node *right;
};

struct Node *makeNode(char c)
{
    struct Node *n = (struct Node *)malloc(sizeof(struct Node));
    n->c = c;
    n->left = NULL;

    n->right = NULL;
    return n;
}

int main()
{
    // Tree construction: O(1)
    struct Node *root = makeNode(' ');
    root->left = makeNode(' ');
    root->right = makeNode(' ');

    root->left->left = makeNode('L');
    root->left->right = makeNode('S');

    root->right->left = makeNode('A');
    root->right->right = makeNode('O');

    char s[10];
    scanf("%s", s);
    // Input scanning: O(k)
    struct Node *cur = root;
    for (int i = 0; s[i]; i++)
    {
        if (s[i] == '0')
            cur = cur->left;
        else
            cur = cur->right;
    }

    // Output: O(1)
    if (cur->c == 'L')
        printf("LOAD\n");
    else if (cur->c == 'S')
        printf("STORE\n");

    else if (cur->c == 'A')
        printf("AND\n");

    else if (cur->c == 'O')
        printf("OR\n");

    return 0;
}

/*
2. Total timecomplexity : O(k)
where k = length of  input string
- Tree construction: O(1)
- Input scanning: O(k)
- Tree traversal: O(k)
- Output: O(1)

3. Rules for Adding and Removing
   - Operations only at leaf nodes
   - No code is prefix of another
   - Internal nodes have 2 children
*/
