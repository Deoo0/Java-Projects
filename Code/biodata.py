# making bio-dataprint ("================================================================")
print("ENTER YOUR PERSONAL INFORMATIONS TO CREATE YOUR BIO-DATA")
print("================================================================")
# getting personal informations to complete the bio-data using inputName = input("Name : ")


def stringInput(name):
    return all(char.isalpha() or char.isspace() for char in name)


def integerInput():
    while True:
        user_input = input()
        try:
            number = int(user_input)  # Convert to integer
            return number
        except ValueError:
            print("\nPLEASE ENTER VALID INPUT\nEnter Integer: ")
 


while True:
    Name = input("Name : ")
    if stringInput(Name):
        break
    else:
        print("Enter Again!\n")

while True:
    Age = print("Enter Age: ")
    if integerInput():
        break
    else:
        print("Enter Again!\n")
    


while True:
    Gender = input("Gender : ")
    if stringInput(Gender):
        break
    else:
        print("Enter Again!\n")

while True:
    Address = input("Address : ")
    if stringInput(Address):
        break
    else:
        print("Enter Again!\n")


while True:
    Weight = input("Weight : ")
    if integerInput():
        break
    else:
        print("Enter Again!\n")

while True:
    Height = input("Height : ")
    if integerInput():
        break
    else:
        print("Enter Again!\n")

while True:
    PhoneNumber = input("Phone Number : ")
    if integerInput():
        break
    else:
        print("Enter Again!\n")

while True:
    Email = input("Email : ")
    if stringInput(Email):
        break
    else:
        print("Enter Again!\n")

while True:
    DateOfBirth = input("Date Of Birth : ")
    if integerInput():
        break
    else:
        print("Enter Again!\n")

while True:
    BirthPlace = input("Birth Place : ")
    if stringInput(BirthPlace):
        break
    else:
        print("Enter Again!\n")

while True:
    Nationality = input("Nationality : ")
    if stringInput(Nationality):
        break
    else:
        print("Enter Again!\n")

while True:
    Religion = input("Religion : ")
    if stringInput(Religion):
        break
    else:
        print("Enter Again!\n")

while True:
    MaritalStatus = input("Marital Status : ")
    if stringInput(MaritalStatus):
        break
    else:
        print("Enter Again!\n")

while True:
    EducationalBackground = input("Educational Background : ")
    if stringInput(EducationalBackground):
        break
    else:
        print("Enter Again!\n")

while True:
    YearLevel = input("Year Level : ")
    if integerInput():
        break
    else:
        print("Enter Again!\n")

while True:
    Course = input("Course : ")
    if stringInput(Course):
        break
    else:
        print("Enter Again!\n")

while True:
    Hobbies = input("Hobbies : ")
    if stringInput(Hobbies):
        break
    else:
        print("Enter Again!\n")

while True:
    Occupation = input("Occupation : ")
    if stringInput(Occupation):
        break
    else:
        print("Enter Again!\n")

while True:
    Weakness = input("Weakness : ")
    if stringInput(Weakness):
        break
    else:
        print("Enter Again!\n")

while True:
    Likes = input("Likes : ")
    if stringInput(Likes):
        break
    else:
        print("Enter Again!\n")


print("================================================================")
# display received inputs from a userprint ("YOUR BIO-DATA IS COMPLETE")
print("================================================================")
print("Name :                          ", Name)
print("Age :                           ", Age)
print("Gender :                        ", Gender)
print("Address :                       ", Address)
print("Weight :                        ", Weight)
print("Height :                        ", Height)
print("Phone Number :                  ", PhoneNumber)
print("Email :                         ", Email)
print("Date Of Birth :                 ", DateOfBirth)
print("Birth Place :                   ", BirthPlace)
print("Nationality :                   ", Nationality)
print("Religion :                      ", Religion)
print("Marital Status :                ", MaritalStatus)
print("Educational Background :        ", EducationalBackground)
print("Year Level :                    ", YearLevel)
print("Course :                        ", Course)
print("Hobbies :                       ", Hobbies)
print("Occupation :                    ", Occupation)
print("Weakness :                      ", Weakness)
print("Likes :                         ", Likes)
print("================================================================")
