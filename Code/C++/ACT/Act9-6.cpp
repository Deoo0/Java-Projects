#include <iostream>

using namespace std;
int main()
{

    int score;

    cout << "Enter a score: ";
    cin >> score;

    if (score >= 90 && score <= 100)
    {
        cout << "Excellent";
    }
    else if (score >= 80 && score <= 89)
    {
        cout << "Good";
    }
    else if (score >= 70 && score <= 79)
    {
        cout << "Fair";
    }
    else if (score >= 0 && score <= 69)
    {
        cout << "Poor";
    }
    else
    {
        cout << "Invalid score";
    }
}