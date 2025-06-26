#include <iostream>

using namespace std;

int main()
{

    int num1;

    cout << "Enter a number: ";
    cin >> num1;

    if (num1 > 0)
    {
        cout << "POSITIVE";
    }
    else if (num1 == 0)
    {
        cout << "ZERO";
    }
    else
    {
        cout << "NEGATIVE";
    }
}