
#ctivity 7

#Write a Python program to calculate the sum of all the elements in a list.

#Bonus points if you can make the user enter their own list.


print("Enter the list of numeric values to sum the values")
print("Enter non-numeric char to stop list entry")
list = []
listElement = input()

while listElement.isnumeric():
    print()
    list.append(listElement)
    listElement = input()




print("\nResults:")
print("Input List: ", list)

for eachElement in range(len(list)):
    list[eachElement] = int(list[eachElement])
print("Sum of list values = ", sum(list))



