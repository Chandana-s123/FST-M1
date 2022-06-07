#List Checker

#Activity 8

#Given a list of numbers, return True if first and last number of a list is same.



print("Enter the numeric values to list to check the first and last values are same or not")
print("Enter non-numeric char to stop list entry")
list = []
listElement = input()

while listElement.isnumeric():
    print()
    list.append(listElement)
    listElement = input()

else:
    print("\nResults:")
    print("Input List: ", list)

if(len(list) == 0):
    print("List is empty")
    raise SystemExit

if list[0] == list[len(list)-1]:
    print("Output: True")
    print("Both 1st and last element in the List are same")
else:
    print("Output: False")
    print("Both 1st and last element in the List are not same")



