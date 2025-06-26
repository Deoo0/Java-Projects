command = ""

started = False

while True:
    command = input().upper()

    if command == "START":
        if started:
            print("Car already started")
        else:
            started = True
            print("Car started.....ready to go")
    elif command == "STOP":
        if not started:
            print("Car already stopped")
        else:
            stopped = False
            print("Car stopped")

    elif command == "HELP":
        print("\nstart - start the car\nstop - stop the car\nquit - to exit\n")
    elif command == "QUIT":
        break
    else:
        print("I don't understand the command")
