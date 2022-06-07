#Activity 14
#Fibonacci Numbers

def fibonnaciCalculator(number):
    fiboList = []
    if(number !=0):
        fiboList.append(1)
    if(number >1):
        fiboList.append(1)
    i=2
    while i<number:
        fiboList.append((fiboList[i-1])+(fiboList[i-2]))
        i+=1
    return fiboList

fiboNum = int(input("Enter number of Fibonnaci's to generate: "))
print("The first ",fiboNum, " fibonnaci numbers are - ",fibonnaciCalculator(fiboNum))

