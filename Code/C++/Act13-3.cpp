#include <iostream>
#include <string>
using namespace std;

void printMsg(string msg)
{
    cout << msg << endl;
}
void printMsg(int n, string msg)
{
    for (int i = 0; i < n; i++)
    {
        cout << msg << endl;
    }
}
void printMsg(int emo)
{
    switch (emo)
    {
    case 1:
        cout << ":-) Happy";
        break;
    case 2:
        cout << ":-( Sad";
        break;
    default:
        cout << ";-) Naughty";
        break;
    }
}
int main()
{
    string msg;
    int n;
    cout << "Enter String: ";
    cin >> msg;
    printMsg(msg);

    cout << "Enter another String: ";
    cin >> msg;
    cout << "How many times would you like to print string: ";
    cin >> n;
    printMsg(n, msg);

    cout << "Enter[1]-Happy [2]-Sad [3]-Naughty: ";
    cin >> n;
    printMsg(n);
}