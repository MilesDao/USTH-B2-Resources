#include <stdio.h>
#include <string.h>

struct Player
{

    char name[12];
    int score;
};

int main()
{
    struct Player player1;
    struct Player player2;

    strcpy(player1.name, "Bill");
    player1.score = 4;

    strcpy(player2.name, "Peter");
    player2.score = 5;

    printf("%s\n %d\n", player1.name, player1.score);
    printf("%s\n %d\n", player2.name, player2.score);
    return 0;
}