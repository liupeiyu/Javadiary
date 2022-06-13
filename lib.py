import pytest
import requests
import json
import yaml
import csv
import xlrd
import unittest

# def readJson():
# 	return json.load(open('login.json','r'))
# def readYaml():
# 	with open('login.yaml','r') as f:
# 		return list(yaml.safe_load_all(f))
# def readCsv():
# 	data=[]
# 	with open('login.csv','r') as f:
# 		reader = csv.reader(f)
# 		next(reader)
# 		for item in reader:
# 			data.append(item)
# 	return data
# def readExcel():
# 	data=[]
# 	book = xlrd.open_workbook('login.xls')
# 	sheet = book.sheet_by_index(0)
# 	for item in range(1,sheet.nrows):
# 		data.append(sheet.row_values(item))
# 	return data 

print(dir(unittest))

