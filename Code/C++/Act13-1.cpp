#include <iostream>
using namespace std;

int isDivisible(int x, int y)
{
    return (x % y ? true : false);
}

int main()
{

    int x, y;
    cout << "Enter two integers: ";
    cin >> x >> y;

    if (isDivisible(x, y) == 0)
    {
        cout << x << " is evenly divisible by " << y;
    }
    else
    {
        cout << x << " is not evenly divisible by " << y;
    }
}
