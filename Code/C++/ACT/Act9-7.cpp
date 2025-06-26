#include <iostream>

using namespace std;
int main()
{
    char colorPick;

    cout << "Enter Letter: ";
    cin >> colorPick;

    if (tolower(colorPick) == 'b')
    {
        cout << "BLUE";
    }
    else if (tolower(colorPick) == 'r')
    {
        cout << "RED";
    }
    else if (tolower(colorPick) == 'g')
    {
        cout << "GREEN";
    }
    else if (tolower(colorPick) == 'y')
    {
        cout << "YELLOW";
    }
    else
    {
        cout << "UNKNOW COLOR";
    }
}