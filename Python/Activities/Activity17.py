#Writing CSV Files

#Activity 17


import pandas as pd

data = {
    "Usernames": ["admin","deku","charles"],
    "Passwords": ["allMight","password","charl123"]
}

table = pd.DataFrame(data)

table.to_csv("dataFile.csv")
print(table)
