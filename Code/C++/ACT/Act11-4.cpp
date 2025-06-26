#include <iostream>
#include <cmath>
using namespace std;

int add(int x, int y)
{
    return x + y;
}
int subtract(int x, int y)
{
    return x - y;
}
int divide(int x, int y)
{
    return x / y;
}
int multiply(int x, int y)
{
    return x * y;
}
int mod(int x, int y)
{
    return x % y;
}
int main()
{
    while (true)
    {
        char choice;
        int x, y;

        cout << "\nArithmethic Operations Menu\n------------------------------\n"
             << endl;
        cout << "<A>ddition\n<S>ubtraction\n<D>ivision\n<M>ultiplication\nM<o>dulus\nE<x>it\n"
             << endl;

        cout << "Enter your choice: ";
        cin >> choice;
        if (choice == 'x')
        {
            exit(0);
        }

        cout << "Enter Numbers: ";
        cin >> x >> y;

        if (choice == 'A')
        {
            cout << x << " + " << y << " = " << add(x, y);
        }
        else if (choice == 'S')
        {
            cout << x << " - " << y << " = " << subtract(x, y);
        }
        else if (choice == 'D')
        {
            cout << x << " / " << y << " = " << divide(x, y);
        }
        else if (choice == 'M')
        {
            cout << x << " * " << y << " = " << multiply(x, y);
        }
        else if (choice == 'o')
        {
            cout << x << " % " << y << " = " << mod(x, y);
        }
    }
}