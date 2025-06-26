#include <iostream>
#include <cmath>

using namespace std;
int main()
{
    int numApples;
    int cost;
    int costDozen = 150;

    cout << "Enter number of Apples: ";
    cin >> numApples;

    if (numApples > 24)
    {
        cost = (150 / 12) * numApples;
        cout << "The cost of " << numApples << " apples is P " << cost;
    }
    else if (numApples <= 24)
    {
        cost = numApples * 10;
        cout << "The cost of " << numApples << " apples is P " << cost;
    }
}