def is_pilandrome(s):
    filtered_text = filter(str.isalnum, s.lower())
    cleaned_text = ''.join(filtered_text)
    char_list = list(cleaned_text)
    x = 0
    y = -1
    pilandrome = " "
    for i in char_list:
        if char_list[x] == char_list[y]:
            x += 1
            y -= 1
        else:
            print("not a pilandrome")
            break
    if x == len(char_list):
        print("it's a pilandrome")
    

text = input("Enter Word: ")
is_pilandrome(text)
