#Multiplication Tables

#Activity 5

#Using Loops:

#Write a Python program to create the multiplication table (from 1 to 10) of a number.


number = input("Enter the number between 1 to 10 for multiplication = ")

if (int(number) >= 1 and int(number) <= 10):
    for i in range(1,11):
        printStatement = "{} x {} = {}"
        print(printStatement.format(int(number),i,int(number)*i))
else:
    print("Invalid number")
