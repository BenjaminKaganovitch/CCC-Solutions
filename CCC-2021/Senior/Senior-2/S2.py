# CCC 2021 Junior 5/Senior 2: Modern Art
# 
# Author: Charles Chen
# 
# The obvious solution for this problem would be to read each swipe, perform it, and
# then count the number of gold cells. This is, however, too slow for 15/15 marks.
#
# To optimize this solution, you have to notice two key things:
# 1) The order in which the swipes are performed doesn't matter
# 2) Duplicate swipes can be removed (don't need to be performed)
# 
# Given this, we will create 2 boolean arrays that will represent which rows and columns
# need to be swiped. We will read in which rows and columns need to be swiped and negate
# the value in the proper index using the ! operator. Using the NOT operator in multiples
# of 2 returns the value back to false, which indicates that the row does not need to be
# swiped, taking advantage of observation 2). If the value at any index ends up as true,
# then that means that row/column needs to be swiped.
#
# We will represent the canvas using a 2D boolean array, where false represents a
# black cell and true represents a gold cell. We will then loop through the arrays
# indicating which rows and columns need to be swiped and perform the necessary swipes.
# The order that we perform the swipes in doesn't matter because of observation 1).
# 
# Finally, loop through the entire 2D array and count the number of true values, which
# represents the number of gold cells.

# Input
rows = int(input())
cols = int(input())
num_lines = int(input())

row_swipes = [False] * (rows + 1)
col_swipes = [False] * (cols + 1)

for i in range(num_lines):
    line_info = input().split(" ")
    index = int(line_info[1])
    if line_info[0] == "R":
        row_swipes[index] = not row_swipes[index]
    else:
        col_swipes[index] = not col_swipes[index]

# Initialize canvas
canvas = [[False for j in range(cols + 1)] for i in range(rows + 1)]

# Go through brush swipes, starting with rows
for i in range(1, rows + 1):
    if row_swipes[i]:
        for j in range(1, cols + 1):
            canvas[i][j] = not canvas[i][j]

# Go through column swipes
for i in range(1, cols + 1):
    if col_swipes[i]:
        for j in range(1, rows + 1):
            canvas[j][i] = not canvas[j][i]

# Count gold cells
gold_count = 0
for i in range(1, rows + 1):
    for j in range(1, cols + 1):
        if canvas[i][j]:
            gold_count += 1

# Output gold count
print(gold_count)
