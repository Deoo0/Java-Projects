#include <iostream>
#include <string>

using namespace std;
string zodiac(int month, int day){
    int lowerCaseMonth = month;
    if ((lowerCaseMonth == 3 || lowerCaseMonth == 4) && ((day >= 21 && day <= 30) || (day >= 1 && day <= 19))){
            return "Aries";
        }
        else if ((lowerCaseMonth == 4 || lowerCaseMonth == 5) && ((day >= 20 && day <= 30) || (day >= 1 && day <= 20))){
            return "Taurus";
        }
        else if ((lowerCaseMonth == 5|| lowerCaseMonth == 6) && ((day >= 21 && day <= 30) || (day >= 1 && day <= 21))){
            return "Gemini";
        }
        else if ((lowerCaseMonth == 6|| lowerCaseMonth == 7) && ((day >= 22 && day <= 30) || (day >= 1 && day <= 22))){
            return "Cancer";
        }
        else if ((lowerCaseMonth == 7|| lowerCaseMonth == 8) && ((day >= 23 && day <= 30) || (day >= 1 && day <= 22))){
            return "Leo";
        }
        else if ((lowerCaseMonth == 8|| lowerCaseMonth == 9) && ((day >= 23 && day <= 30) || (day >= 1 && day <= 22))){
            return "Virgo";
        }
        else if ((lowerCaseMonth == 9 || lowerCaseMonth == 10) && ((day >= 23 && day <= 30) || (day >= 1 && day <= 23))){
            return "Libra";
        }
        else if ((lowerCaseMonth == 10 || lowerCaseMonth == 11) && ((day >= 24 && day <= 30) || (day >= 1 && day <= 21))){
            return "Scorpio";
        }
        else if ((lowerCaseMonth == 11|| lowerCaseMonth == 12) && ((day >= 22 && day <= 30) || (day >= 1 && day <= 21))){
            return "Sagittarius";
        }
        else if ((lowerCaseMonth == 12 || lowerCaseMonth == 1) && ((day >= 22 && day <= 31) || (day >= 1 && day <= 19))){
            return "Capricorn";
        }
        else if ((lowerCaseMonth == 1|| lowerCaseMonth == 2) && ((day >= 20 && day <= 30) || (day >= 1 && day <= 18))){
            return "Aquarius";
        }
        else{
            return "Pisces";
        }
    
    

}
int main()
{
    cout << "\nHi User\nPlease input necessary data ; )\n";
    cout << "---------- USER DATA ----------\n";
    string firstName, lastName,middleName,motherFname,motherLname,fatherFname,fatherLname,address,birthYear,zodiac,workOrSchool,hobby;
    int age, birthDay,birthMonth;
    cout << "Enter First name: ";
    getline(cin, firstName);
    cout << "Enter Last name: ";
    cin >> lastName;
    cout << "Enter Midde name: ";
    cin >> middleName;
    cout << "Enter Mother first name: ";
    cin >> motherFname; 
    cout << "Enter Mother last name: ";
    cin >> motherLname;
    cout << "Enter Father first name: ";
    cin >> fatherFname;
    cout << "Enter Father last name: ";
    cin >> fatherLname;

    cout << "Welcome " + firstName + "\n";
    cout << "Enter Age: ";
    cin >> age;
    cout << "Enter Address: ";
    cin >> address;
    cout << "---------- FORMAT MM/DD/YYYY ----------\n";
    cout << "Enter Birth Month: ";
    cin >> birthMonth;
    cout << "Enter Birth Day: ";
    cin >> birthDay;
    cout << "Enter Birth Year: ";
    cin >> birthYear;
    zodiac(birthMonth,birthDay);

}