#include <iostream>
#include <string>

using namespace std;
int main()
{
    int score;

    cout << "Enter Score: ";
    cin >> score;

    if (score > 1 && score < 5)
    {
        cout << "Fail" << endl;
    }
    else if (score == 6 && score < 11)
    {
        cout << "Passed" << endl;
    }
}