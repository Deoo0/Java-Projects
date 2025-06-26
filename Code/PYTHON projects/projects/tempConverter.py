temp = int(input("Enter Temperature: "))

scale = input("Is the temperature in Celsius or Fahrenheit? (C/F): ")

if scale.lower() == "c":
    converted_temp = (temp * 9/5) + 32
    new_scale = "Fahrenheit"
elif scale.lower() == "f":
    converted_temp = (temp - 32) * 5/9
else:
    print("Invalid")
    exit()

print(f"The temperature is converted to {new_scale}: {converted_temp}")
