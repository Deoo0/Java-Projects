queue = []

def enQueue():
    print("\nF - To Enqueue in Front\nR - To Enqueue in Rear\n")
    userInput = input("Enter where to Enqueue Data: ").upper()
    match userInput:
        case "F":
            dataToInstert = input("Enter data to Insert: ")
            queue.insert(0,dataToInstert)
            print(f"\n{dataToInstert} Successfully added to Queue\n")
        case "R":
            dataToInstert = input("Enter data to Insert: ")
            queue.append(dataToInstert)
            print(f"\n{dataToInstert} Successfully added to Queue\n")
        case _:
            print("\nPLEASE ENTER VALID INPUT")

def deQueue():
    if len(queue) == 0:
        print("\nQueue is Empty\n")
        menu()
    else:
        print("\nF - To Dequeue in Front\nR - To Dequeue in Rear\n")
        userInput = input("Enter where to Dequeue Data: ").upper()
        match userInput:
            case "F":
                print(f"\n{queue.pop(0)} has been removed from Queue\n")
                menu()
            case "R":
                print(f"\n{queue.pop(-1)} has been removed from Queue\n")
                menu()
            case _:
                print("Invalid Input, Please Enter Again!")

def size():
    print(f"\nSize of the current Queue is: {len(queue)}")

def isEmpty():
    if len(queue) == 0:
        print("\nQueue is Empty, Input Values")
    else:
        print("\nQueue is not Empty")
        
def peek():
    if len(queue) == 0:
        print("\nQueue is Empty")
    else:
        print(f"\n{queue[0]} and {queue[-1]} is Ready for Dequeue")

def quit():
    print("\nExiting.......")
    exit()

def menu():
    while True:
        print("=======================================\n\t\tMENU\n=======================================\n")
        print("A - EnQueue\nB - Dequeue\nC - List size\nD - List checker\nE - Peek\nF - Display\nX - Exit")
        userChoice = input("\nEnter Letter: ").upper()
        match(userChoice):
            case "A":
                enQueue()
            case "B":
                deQueue()
            case "C":
                size()
            case "D":
                isEmpty()
            case "E":
                peek()
            case "F":
                print(queue)
            case "X":
                quit()
            case _:
                print("Invalid Input")


menu()
