#include <iostream>
#include <string>

using namespace std;

bool subString(string main, string sub)
{
    int findKey = main.find(sub);
    if (findKey == -1)
    {
        cout << sub + " is not in " + main;
    }
    else
    {
        cout << sub + " is in " + main;
    }
}
int main()
{
    string main, sub;

    cout << "Enter main string: ";
    cin >> main;
    cout << "Enter sub string: ";
    cin >> sub;

    subString(main, sub);
}