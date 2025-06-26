#include <iostream>

using namespace std;

int main()
{
    int x, y, z;

    cout << "Enter 3 numbers: ";
    cin >> x >> y >> z;

    if (x > y && x > z)
    {
        cout << "The Largest is " << x;
    }
    else if (y > x && y > z)
    {
        cout << "The Largest is " << y;
    }
    else
    {
        cout << "The Largest is " << z;
    }
}