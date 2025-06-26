#include <iostream>
using namespace std;

float computeArea(float lenght, float width)
{

    float area = lenght * width;

    return area;
}

int main()
{
    float length, width, area;
    cout << "Please Enter the length and width: " << endl;
    cin >> length >> width;

    area = computeArea(length, width);

    cout << "The area of the rectangle is: " << area << endl;
}
