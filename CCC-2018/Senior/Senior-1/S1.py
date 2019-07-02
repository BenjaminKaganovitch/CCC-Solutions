# CCC 2018 Senior 1: Voronoi Villages
#
# Author: Charles Chen
#
# Arrays and calculations

# Initialize variables
min_size = 20000000000
size_left = 0
size_right = 0
total_size = 0

# Input
points = []
num_villages = int(input())
for i in range(num_villages):
    points.append(int(input()))

# Sort the points
points.sort()

# Find smallest neighbourhood size
for i in range(1, num_villages - 1):
    diff_left = points[i] - points[i-1]
    diff_right = points[i+1] - points[i]
    size_left = diff_left / 2
    size_right = diff_right / 2

    total_size = size_left + size_right
    if total_size < min_size:
        min_size = total_size

print("{:.1f}".format(min_size))
