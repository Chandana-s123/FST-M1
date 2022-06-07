#Recursive Adder

#Activity 12

#Write a recursive function to calculate the sum of numbers from 0 to 10


def sumofNums(lowVal,highVal):
    if lowVal<highVal:
        return lowVal+sumofNums(lowVal+1,highVal)
    else:
        return lowVal


print("Sum of 0 to 10 - ",sumofNums(0,10))
