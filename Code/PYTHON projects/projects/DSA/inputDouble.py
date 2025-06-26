queue = []
def enQueue():
    if len(queue) >= 10:
        print("Queue is already Full")
    else:
        dataToInstert = input("Enter data to Insert: ")
        queue.append(dataToInstert)
        print(f"\n{dataToInstert} is Successfully Added\n")
    
def deQueue():
    print("F - To Dequeue in Front\nR - To Dequeue in Rear")
    userInput = input("Enter where to Dequeue Data: ").upper()
    if len(queue) == 0:
        print("Queue is Empty")
        menu()
    elif userInput == "F":
        print(f"\n{queue.pop(0)} has been removed from Queue\n")
        menu()
    elif userInput == "R":
        print(f"\n{queue.pop(-1)} has been removed from Queue\n")
        menu()
            
def size():
    print(f"Size of the current Queue is: {len(queue)}")
def isEmpty():
    if len(queue) == 0:
        print("Queue is Empty, Input Values")
    else:
        print("Queue is not Empty")
def peek():
    if len(queue) == 0:
        print("Queue is Empty")
    else:
        print(f"{queue[0]} and {queue[-1]} is Ready for Dequeue")
def display():
    print(queue)
def quit():
    print("\nExiting.......")
    exit()
    
def menu():
    while True:
        print("=======================================\n\t\tMENU\n=======================================\n")
        print("A - enQueue\nB - Dequeue\nC - List size\nD - List checker\nE - Peek\nF - Display\nX - Exit")
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
                display()
            case "X":
                quit()
            case _:
                print("Invalid Input")
                
menu()

