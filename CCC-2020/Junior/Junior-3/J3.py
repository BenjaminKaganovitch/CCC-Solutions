# CCC 2020 Junior 3: Art
#
# Author: Charles Chen
#
# Find minimum and maximum value in an array

# Input
drops = int(input())
x = []
y = []

for i in range(drops):
    input_data = input().split(",")
    x.append(int(input_data[0]))
    y.append(int(input_data[1]))

# Find minimum and maximum of coordinates
x_min = 20000000000
x_max = -20000000000
y_min = 20000000000
y_max = -20000000000

for i in range(drops):
    if x[i] < x_min:
        x_min = x[i]
    if x[i] > x_max:
        x_max = x[i]
    if y[i] < y_min:
        y_min = y[i]
    if y[i] > y_max:
        y_max = y[i]

# Output
print(x_min - 1, y_min - 1, sep=",")
print(x_max + 1, y_max + 1, sep=",")
