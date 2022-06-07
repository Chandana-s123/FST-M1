#Reading CSV Files
#Activity 18


import pandas as pd

data = pd.read_csv("dataFile.csv")

print("Lis the full Table data \n", data, "\n---------------------------------------")
print("List the Usernames \n",data["Usernames"],"\n---------------------------------------")
print("List the 2nd column Username and password details\n",data["Usernames"][1],data["Passwords"][1],"\n---------------------------------------")
print("List the Usernames in Ascending order \n",data["Usernames"].sort_values(ascending=True),"\n---------------------------------------")
print("List the Passwords in Descending order \n", data["Passwords"].sort_values(ascending=False),"\n---------------------------------------")