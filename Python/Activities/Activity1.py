#Activity 1


#Write a program that asks the user to enter their name and their age.
#Print out a message addressed to them that tells them the year that they will turn 100 years old.

name = input("Enter your name - ")
age = int(input("Enter your age - "))
year = int(input("Enter current year - "))
year = str(year+100-age)
print("By " + year + " " + name + " will be turing to 100")


