#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int num1;
    int square;

    cout << "Enter a number: ";
    cin >> num1;

    if (num1 > 0)
    {

        cout << "The square of " << num1 << " is " << pow(num1, 2);
    }
    else
        cout << "Not Positive";
}