inetial_Weight = int(input("Weight: "))
unit = input("(L)bs or (K)g: ")

if unit.upper() == "L":
    converted_W = int(inetial_Weight * 0.45)
    print(f"You are {converted_W} pounds")
elif unit.upper() == "K":
    converted_W = int(inetial_Weight * 2.2)
    print(f"You are {converted_W} pounds")
