#include <iostream>
#include <cmath>
using namespace std;

int getCube(int x)
{
    return pow(x, 3);
}

int main()
{
    int num;
    cout << "Please Enter a Number: ";
    cin >> num;

    int cube = getCube(num);
    cout << "The cube root of the number " << num << " is " << cube;
}