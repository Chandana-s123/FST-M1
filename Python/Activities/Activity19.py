#Activity19
#Writing Excel Files

import pandas as pd
from pandas import ExcelWriter

data = {
    "FirstName": ["Satvik","Avinash","Lahri"],
    "LastName": ["Shah","Kati","Kati"],
    "Email": ["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber":["lahri.rath@example.com","5892184058","4528727830"]
}

dataFrame = pd.DataFrame(data)
createExcel = ExcelWriter("excel.xlsx")

dataFrame.to_excel(createExcel,"sheet1")
createExcel.save()
print(dataFrame)