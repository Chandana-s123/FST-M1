#Fruit Shop

#Activity 11

#Create a Python dictionary that contains a bunch of fruits and their prices.

#Write a program that checks if a certain fruit is available or not.


fruits = {
    "Apple" : 20,
    "Banana" : 90,
    "WaterMelon" :40,
    "Grapes" : 30,
    "Muskmelon" :45,
    "Chickoo" : 34
}
fruitExist = False

inputItem = input("Enter the fruit to check for exists: ")

for eachItem in fruits:
    if (eachItem.lower() == inputItem.lower()):
        fruitExist = True

if fruitExist:
    print(inputItem, ": Exist in the Dictionary")
else:
    print(inputItem, ": Doesnot Exist in the Dictionary")