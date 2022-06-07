#Activity 2

#Ask the user for a number.
#Depending on what number they enter, tell them if the number is an even or odd number.

Num = input("Enter the number - ")
if (int(Num)%2 == 0):
    print(Num + " Is a Even number")
else:
    print(Num + " Is a Odd number")