#Activity 10

#Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5

tupleData = list(input("Program to list the numbers which are divisible by 5\nEnter a sequence of numbers with comma separated: ").split(","))

print("Input tuple data: ",tuple(tupleData))
newtuple = []

i = 0
for eachVal in tupleData:
    if(int(eachVal)%5 == 0):
        newtuple.insert(i, eachVal)
        i+=12

print("Input values which are divisable by 5 are :", newtuple)
