#include <iostream>
using namespace std;

int main()
{

    int number;
    int positiveCount = 0;

    for (int i = 1; i <= 10; ++i)
    {
        cout << i << ". Enter a number: ";
        cin >> number;

        if (number > 0)
        {
            positiveCount++;
        }
    }

    cout << "There are " << positiveCount << " positive numbers entered." << endl;
}