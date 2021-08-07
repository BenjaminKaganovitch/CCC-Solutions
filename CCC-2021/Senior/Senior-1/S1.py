# CCC 2021 Senior 1: Crazy Fencing
# 
# Author: Charles Chen
# 
# Calculate area of trapezoids using provided formula

total_area = 0

# Input
num_fences = int(input())
heights = list(map(int, input().split(" ")))
widths = list(map(int, input().split(" ")))

# Calculate total area
for i in range(num_fences):
    total_area += ((heights[i] + heights[i + 1]) * widths[i]) / 2

# Output
print(total_area)
