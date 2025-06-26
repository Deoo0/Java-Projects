def isValidInput(name):
    return all(char.isalpha() or char.isspace() for char in name)

def addProduct():
    while True:
        newProduct = input("Add new product: ").upper()
        if groceries.count(newProduct) == 1:
            print("Sorry, product already EXIST")
        else:
            groceries.append(newProduct)
            print("\nProduct successfully ADDED\n")
            print(groceries)
            break
        
def removeProduct():
    while True:
        product = input("Remove product: ").upper()
        if groceries.count(product) == 1:
            groceries.remove(product)
            print("\nProduct successfully REMOVED\n")
            print(groceries)
            break
        else:
            print("Product Doesn't Exist")
            
def mainMenu():
    print("\t\tMENU\n=======================================\n")
    print("(A) for Adding Product\n(R) for Removing Product\n(E) for Exit")
    userChoice = input("\nSelect a Letter: ").upper()
    while (True):
        if isValidInput(userChoice) == True and userChoice == "A":
            addProduct()
            print("(A) for Adding Product\n(R) for Removing Product\n(E) for Exit")
            userChoice = input("\nSelect a Letter: ").upper()
        elif isValidInput(userChoice) == True and userChoice == "R":
            removeProduct()
            print("(A) for Adding Product\n(R) for Removing Product\n(E) for Exit")
            userChoice = input("\nSelect a Letter: ").upper()
        elif isValidInput(userChoice) == True and userChoice == "E":
            exit()
        else:
            print("\n\nInvalid Input, ENTER AGAIN!\n(A) for Adding Product\n(R) for Removing Product\n(E) for Exit")
            userChoice = input("\nSelect a Letter: ").upper()


groceries = ['MILO', 'BEER', 'SOJO','EGG', 'KOPIKO']
productId = 1
for prod in groceries:
    print(f"{productId}. {prod}")
    productId += 1
mainMenu()


