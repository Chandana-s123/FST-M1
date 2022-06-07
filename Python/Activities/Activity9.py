#Combining Lists

#Activity 9

#Given a two list of numbers create a new list such that new list should contain only odd numbers from the first list and even numbers from the second list.


list1 = ['1','2','3','4','5','6']
list2 = ['1','2','3','4','5','6']

for num in list1:
    if (int(num)%2 == 0):
        list1.remove(num)

for num in list2:
    if (int(num)%2 != 0):
        list2.remove(num)

listFinal = list1+list2
print("Final list : ", listFinal)

