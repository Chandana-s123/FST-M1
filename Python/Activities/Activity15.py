#Activity 15
#Write a Python program that throws a NameError.


print("Program catch's any name exception\n")

try:
    print(test)
except:
    print("Exception occured")
    print("NameError: name 'test' is not defined\n")

print("Execution continues since Error is handled using try catch")
