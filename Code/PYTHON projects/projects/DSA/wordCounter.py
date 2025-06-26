def isValidInput(name):
    return all(char.isalpha() or char.isspace() for char in name)


def mainMenu():
    print("=======================================\n\t\tMENU\n=======================================\n")
    print("(A) to OUTPUT the longest word\n(B) to OUTPUT the second to the last letter of every word\n(C) to All words with odd # of char in list\n(D) to Exit")
    userChoice = input("\nSelect a Letter: ").upper()
    while (True):
        if isValidInput(userChoice) == True and userChoice == "A":
            maxLen()
            mainMenu()
        elif isValidInput(userChoice) == True and userChoice == "B":
            secondLetter()
            mainMenu()
        elif isValidInput(userChoice) == True and userChoice == "C":
            oddWord()
            mainMenu()
        elif isValidInput(userChoice) == True and userChoice == "D":
            exit()
        else:
            mainMenu()


words = ['python', 'money', 'lawrence', 'anime', 'deo', 'security']
list2 = []


def maxLen():
    res = 0
    resWord = ' '
    for text in words:
        countTxt = len(text)
        if res < countTxt:
            res = countTxt
            resWord = text
    print(f"\nLongest Word: {resWord}\nlength of word is: {
          res} at index {words.index(resWord)}\n")


def secondLetter():
    for text in words:
        print(f"\nThe second to the last letter of: {text} is: {text[-2]}\n")


def oddWord():
    for text in words:
        countTxt = len(text)
        if countTxt % 2 == 1:
            list2.append(text)
    print(f"\nAll words with odd # of char in list are: {list2}\n")


print(f"The list is:")
for i in words:
    print(f"List index {words.index(i)}: {i}")
mainMenu()
