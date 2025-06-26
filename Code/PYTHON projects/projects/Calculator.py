def add(x, y):
    print(f"{num1} + {num2} = {x + y} ")


def sub(x, y):
    print(f"{num1} - {num2} = {x - y}")


def div(x, y):
    print(f"{num1} / {num2} = {x / y}")


def multi(x, y):
    print(f"{num1} x {num2} = {x * y}")


def mod(x, y):
    print(f"{num1} % {num2} = {x % y}")


print("Arithmetic Operations Menu\n-------------------------")
print("<A>ddition\n<S>ubtraction\n<D>ivision\n<M>ultiplication\nM<o>dulos\nE<x>it\n-------------------------")

userInput = input("Enter your choice: ")
if userInput.lower() == 'x':
    exit()

num1 = int(input("Enter 1st number: "))
num2 = int(input("Enter 2nd number: "))

if userInput.lower() == 'a':
    add(num1, num2)
elif userInput.lower() == 's':
    sub(num1, num2)
elif userInput.lower() == 'd':
    div(num1, num2)
elif userInput.lower() == 'm':
    multi(num1, num2)
elif userInput.lower() == 'o':
    mod(num1, num2)
