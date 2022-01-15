import numpy as np

print(np.__version__)
print("Example 1")

A = [[1, 4, 5, 12], 
    [-5, 8, 9, 0],
    [-6, 7, 11, 19]]

B = [[1, 2, 3],
     [3, 4, 5],
     [5, 6, 7],
     [7, 8, 9]]

# print("A =", A) 
# print("A[1] =", A[1])      # 2nd row
# print("A[1][2] =", A[1][2])   # 3rd element of 2nd row
# print("A[0][-1] =", A[0][-1])   # Last element of 1st Row

# Row wise multiplication
Crow = []
for y in range(len(A)):
    aRow = []
    for x in range(len(B[0])):
        aRow.append(0)
    Crow.append(aRow)

# iterate through rows of A
for i in range(len(A)):
   # iterate through columns of B
   for j in range(len(B[0])):
       # iterate through rows of B
       for k in range(len(B)):
           Crow[i][j] += A[i][k] * B[k][j]

print("Row wise multiplication")
for r in Crow:
   print(r)

# Column wise multiplication
# 
Ccol = []
for y in range(len(A)):
    aRow = []
    for x in range(len(B[0])):
        aRow.append(0)
    Ccol.append(aRow)

# iterate through columns of B
for k in range(len(B[0])):
   # iterate through rows of A
   for i in range(len(A)):
       # iterate through rows of B
       for j in range(len(B)):
           Ccol[i][k] += A[i][j] * B[j][k]

print("Column wise multiplication")
for r in Ccol:
   print(r)

arr = np.array([[1, 2, 3], [4, 5, 6]])
#print(arr)
#print(type(arr))