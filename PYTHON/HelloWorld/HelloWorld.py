print("Hello World")

if 5 > 2:
    print("Five is greater than two!")

x = "awesome"

def myfunc():
  global x
  x = "fantastic"

myfunc()

print("Python is " + x)

x = memoryview(bytes(5))
print(x)
print(type(x))

a = " Hello"
b = "World "
c = (a + ",\t " + b).split(",")
print(c)
print(c[0].strip().center(11,"*"))
print(c[1])

quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))

#use a dictionary with ascii codes to replace 83 (S) with 80 (P):
mydict = {83:  80}
txt = "Hello Sam!"
print(txt.translate(mydict))

a = 200
b = 33

if b > a:
  print("b is greater than a")
else:
  print("b is not greater than a")

fruits = ("apple", "mango", "papaya", "pineapple", "cherry")

(green, *tropic, red) = fruits

print(green)
print(tropic)
print(red)

thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964,
  "year": 2020
}
print(thisdict)

car = {
"brand": "Ford",
"model": "Mustang",
"year": 1964
}

x = car.items()

print(x) #before the change

car["color"] = "red"

print(x) #after the change

def tri_recursion(k):
  if(k > 0):
    result = k + tri_recursion(k - 1)
    print(result)
  else:
    result = 0
  return result

print("\n\nRecursion Example Results")
tri_recursion(6)

x = lambda a : a + 10
print(x(5))

def myfunc(n):
  return lambda a : a * n

mydoubler = myfunc(2)
mytripler = myfunc(3)

print(mydoubler(11))
print(mytripler(11))

x = 300

def myfunc():
  x = 200
  print(x)

myfunc()

print(x)

import math

x = math.pi

print(x)

import json

# some JSON:
x =  '{ "name":"John", "age":30, "city":"New York"}'

# parse x:
y = json.loads(x)

# the result is a Python dictionary:
print(y)
z = json.dumps(y)
print(z)

x = {
  "name": "John",
  "age": 30,
  "married": True,
  "divorced": False,
  "children": ("Ann","Billy"),
  "pets": None,
  "cars": [
    {"model": "BMW 230", "mpg": 27.5},
    {"model": "Ford Edge", "mpg": 24.1}
  ]
}

y = json.dumps(x)
z = json.loads(y)
print(z)
print(json.dumps(z))

try:
  print(x)
except NameError: 
    print("x is not defined yet")
except:
  print("Something went wrong")
else:
  print("Nothing went wrong")
finally:
  print("The 'try except' is finished")

