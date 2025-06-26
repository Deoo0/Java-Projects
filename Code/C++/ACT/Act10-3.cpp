#include <iostream>
using namespace std;

int main()
{
    int x;
    int y = 1;

    cout << "Enter a number: ";
    cin >> x;

    do
    {
        cout << y << ". " << x << endl;
        y++;
    } while (y <= x);
}