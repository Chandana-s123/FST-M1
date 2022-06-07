#Activity20
##Reading Excel Files

import pandas as pd
from pandas import ExcelWriter

readExcelData = pd.read_excel("excel.xlsx",sheet_name="sheet1")
print("Reading the Excel data \n", readExcelData,"\n---------------------------------------")
print("Printing number of rows and columns of excel data \n", readExcelData.shape,"\n---------------------------------------")
print("Reading only Email data from Excel\n ", readExcelData["Email"],"\n---------------------------------------")
print("Reading and sorting the Firstname data from excel\n",readExcelData["FirstName"].sort_values(),"\n---------------------------------------")