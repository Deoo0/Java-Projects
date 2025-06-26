# Function to Identify and Output the Zodiac Sign of User
def zodiacSign(month, day):
    if (month == 3 or month == 4) and (day >= 21 and day <= 30 or day >= 1 and day <= 19):
        return "Aries"
    elif (month == 4 or month == 5) and (day >= 20 and day <= 30 or day >= 1 and day <= 20):
        return "Taurus"
    elif (month == 5 or month == 6) and (day >= 21 and day <= 30 or day >= 1 and day <= 21):
        return "Gemini"
    elif (month == 6 or month == 7) and (day >= 22 and day <= 30 or day >= 1 and day <= 22):
        return "Cancer"
    elif (month == 7 or month == 8) and (day >= 23 and day <= 30 or day >= 1 and day <= 22):
        return "Leo"
    elif (month == 8 or month == 9) and (day >= 23 and day <= 30 or day >= 1 and day <= 22):
        return "Virgo"
    elif (month == 9 or month == 10) and (day >= 23 and day <= 30 or day >= 1 and day <= 23):
        return "Libra"
    elif (month == 10 or month == 11) and (day >= 24 and day <= 30 or day >= 1 and day <= 21):
        return "Scorpio"
    elif (month == 11 or month == 12) and (day >= 22 and day <= 30 or day >= 1 and day <= 21):
        return "Sagittarius"
    elif (month == 12 or month == 1) and (day >= 22 and day <= 31 or day >= 1 and day <= 19):
        return "Capricorn"
    elif (month == 1 or month == 2) and (day >= 20 and day <= 30 or day >= 1 and day <= 18):
        return "Aquarius"
    elif (month == 2 or month == 3) and (day >= 19 and day <= 30 or day >= 1 and day <= 20):
        return "Pisces"
    else:
        print("Invalid Input")


def integerChecker():
    while True:
        user_input = input()
        try:
            number = int(user_input)  # Convert to integer
            return number
        except ValueError:
            print("\nPLEASE ENTER VALID INPUT\nEnter Integer: \r")

# Function to identify the year level of the user


def yearlvl(x):
    lowerx = x.lower()
    match lowerx:
        case "a":
            return "Freshmen"
        case "b":
            return "Sophmore"
        case "c":
            return "Junior"
        case "d":
            return "Senior"


def school():
    while True:
        nameSchool = input("Enter School name: ")
        course = input(f"What is your Program at {nameSchool}? :")
        if nameSchool.isalpha() and course.isalpha:
            break
        else:
            print("Invalid Input, Try Again")

    section = input("Section name: ")
    while True:
        yearLvl = input(
            "\n(a)-freshmen\n(b)-sophmore\n(c)-junior\n(d)-senior\nSelect letter of year level: ").lower()
        if yearLvl == "a" or yearLvl == "b" or yearLvl == "c" or yearLvl == "d":
            break
        else:
            print("Invalid Input please choose again!\n")
    print(f"\nYou're a {yearlvl(yearLvl)} studying {
          course}, section {section} at {nameSchool} \nNICE!!\n")


def work():
    while True:
        jobName = input("Enter current Job Title: ")
        companyName = input("Enter Company name: ")
        if jobName.isalpha() and companyName.isalpha():
            print(f"\nYou're a {jobName} at {companyName} \nNICE!!\n")
            break
        else:
            print("Invalid Input, Try Again")

# Check if all characters are letters or spaces


def isValidInput(name):
    return all(char.isalpha() or char.isspace() for char in name)


def inputData():
    print("\nHi User\nPlease input necessary data ; )\n")
    while True:
        print("---------- USER DATA ----------\n")
        global firstName, lastName, middleName
        firstName, lastName, middleName = input("Enter first name: "), input(
            "Enter last name: "), input("Enter middle name: ")
        if isValidInput(firstName) and isValidInput(lastName) and isValidInput(middleName):
            break
        else:
            print("\nPLEASE ENTER VALID INPUT\n")
    while True:
        print("\n---------- USER MOTHER DATA ----------")
        global motherFname, motherLname
        motherFname, motherLname = input(
            "Enter mother first name: "), input("Enter monther last name: ")
        if isValidInput(motherFname) and isValidInput(motherLname):
            break
        else:
            print("\nPLEASE ENTER VALID INPUT\n")
    while True:
        print("\n---------- USER FATHER DATA ----------")
        global fatherFname, fatherLname
        fatherFname, fatherLname = input(
            "Enter father first name: "), input("Enter father last name: ")
        if isValidInput(fatherFname) and isValidInput(fatherLname):
            break
        else:
            print("\nPLEASE ENTER VALID INPUT\n")
    print("\n-----------------------------------------------------")

    print(f"\nWelcome {firstName}!\n")

    while True:
        print("Enter Age: ")
        global age
        age = integerChecker()
        if (age > 0 and age < 120):
            break
        else:
            print("\nENTER VALID AGE\n")
    while True:
        print("Format (MM/DD/YYYY)")
        global birthMonth
        print("Enter birth Month: ")
        birthMonth = integerChecker()
        if birthMonth >= 1 and birthMonth <= 12:
            break
        else:
            print("\nPlease Enter VALID INPUT")

    while True:
        print("Enter birth Day: ")
        global birthDate
        birthDate = integerChecker()
        if birthDate >= 1 and birthDate <= 31:
            break
        else:
            print("ENTER VALID DAY (1-31)")
    while True:
        print("Enter birth Year: ")
        global birthYear
        birthYear = integerChecker()
        if birthYear >= 1904 and birthYear <= 2024:
            break
        else:
            print("ENTER YEAR DAY (1904 - 2024)")
    # Function for Zodiac Sign is called and stored in a variable
    global zodiac
    zodiac = zodiacSign(birthMonth, birthDate)
    print(f"Your Zodiac Sign is: {zodiac}")
    global address
    address = input("\nEnter Current Address: ")

    while True:
        workOrSchool = input(
            "Type (s) for Student & (e) for Employee: ").lower()
        if workOrSchool == "s":
            # Call school function
            school()
            break
        elif workOrSchool == "e":
            # Call work function
            work()
            break
        else:
            print("Invalid Input")

    while True:
        global maritalStatus
        maritalStatus = input(
            "\n(a)- Married\n(b)- Single \n(c)- Widowed\n(d)- Separated\nSelect letter of Marital Status: ").lower()
        if maritalStatus == "a" or maritalStatus == "b" or maritalStatus == "c" or maritalStatus == "d":
            match maritalStatus:
                case "a":
                    maritalStatus = "Married"
                case "b":
                    maritalStatus = "Single"
                case "c":
                    maritalStatus = "Widowed"
                case "d":
                    maritalStatus = "Separated"
            break
        else:
            print("Invalid Input please choose again!")

    print("\nDATA SAVED\n")
    global inputDone
    inputDone = True
    mainMenu()


def printalldata(userFname, userLname, motherFname, fatherFname, age, address, birthM, birthD, birthY, zodiac, status):
    return print(f"\n\tBIO DATA!\n\n\tUSER DATA\n===============================\nFirst Name: {userFname}\nLast Name: {userLname}\nAge: {age} years old\nAddress: {address}\nMarital Status: {status}\nDate of Birth: {birthM}/{birthD}/{birthY}\nZodiac Sign: {zodiac}\n\n    Parents Information\n===============================\nMother first name:{motherFname}\nFather first name:{fatherFname}\n===============================")


def mainMenu():
    print("\t\tMENU\n=======================================\n")
    print("(I) for Inputting Data\n(O) for Outputting Data\n(E) for Exit")
    userChoice = input("\nSelect a Letter: ").lower()
    while (True):
        if isValidInput(userChoice) == True and userChoice == "i":
            inputData()
        elif userChoice == "o" and isValidInput(userChoice) == True and inputDone == True:
            # OUTPUT all the data
            printalldata(firstName, lastName, motherFname, fatherFname, age,
                         address, birthMonth, birthDate, birthYear, zodiac, maritalStatus)
            userChoice = input("\nSelect a Letter: ").lower()
        elif userChoice == "o" and isValidInput(userChoice) == True and inputDone == False:
            print("There is no Information in the system, please input your data first")
            userChoice = input("\nSelect a Letter: ").lower()
        elif userChoice == "e" and isValidInput(userChoice) == True:
            exit()
        else:
            print("\n\nInvalid Command, Enter again\n(I) for Inputting Data\n(O) for Outputting Data\n(E) for Exit")
            userChoice = input("\nSelect a Letter: ").lower()


# START OF PROGRAM
inputDone = False
mainMenu()


# LOOK FOR VALUES NEED TO BULLETPROOF (birth month & birth year)
# IMPROVE OUTPUT DATA DISPLAY
