#include <iostream>
#include <cmath>
using namespace std;

int main()
{

    int numWords;
    double totalCost;
    double exCost = 0.06;

    cout << "Enter the number of words in a telegram: ";
    cin >> numWords;

    if (numWords < 20)
    {
        totalCost = 15;
    }
    else
    {
        totalCost = (numWords % 20) * 0.60 + 15;
    }

    cout << "The cost of " << numWords << " words is " << totalCost;
}