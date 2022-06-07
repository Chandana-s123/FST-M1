#Activity 13
#Write a function sum() such that it can accept a list of elements and print the sum of all elements

def sumofNums(listVals):
    sum = 0
    for item in listVals:
        sum += item
    return sum

print("Enter the List of numbers to calculate Sum using functions")
print("Enter non-numeric char to stop list entry")
list = []
listElement = input()

while listElement.isnumeric():
    print()
    list.append(int(listElement))
    listElement = input()

print("Sum of list values ", list, " - ", sumofNums(list))
