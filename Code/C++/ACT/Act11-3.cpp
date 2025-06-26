#include <iostream>
using namespace std;

int printMsg(int x)
{
    for (int y = 0; y < x; y++)
    {
        cout << "Hello World" << endl;
    }
}

int main()
{
    int num;
    cout << "How many times do you want to display the message? " << endl;
    cin >> num;

    printMsg(num);
}