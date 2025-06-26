#include <iostream>

using namespace std;
int main()
{
    int noHours;
    double weekSalary;

    cout << "Enter Num hours: " << endl;
    cin >> noHours;

    if (noHours >= 1 && noHours < 40)
    {
        weekSalary = (30 * noHours) * 7;
    }
    else if (noHours > 40)
    {
        weekSalary = ((noHours % 40) * 40 + 1200) * 7;
    }

    cout << "week salary: " << weekSalary;
}