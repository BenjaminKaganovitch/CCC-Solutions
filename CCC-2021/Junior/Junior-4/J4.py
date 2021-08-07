# CCC 2021 Junior 4: Arranging Books
#
# Author: Charles Chen
# 
# This solution is inspired by a formula described by Aaron He on YouTube. The
# formula is:
#
# minSwaps = (# misplaced books in L) + (# misplaced books in M)
# - MIN((# of M books in L), (# of L books in M))
#
# For the reasoning behind this formula and solution, see Aaron's video describing
# the solution to this problem: https://youtu.be/rBeIOwfwKSI

# Initialize variables
num_l = 0
num_m = 0
misplaced_l = 0
misplaced_m = 0
m_in_l = 0
l_in_m = 0

# Input
shelf = input()

# Count the number of large and medium books
for i in range(len(shelf)):
    if shelf[i] == "L":
        num_l += 1
    elif shelf[i] == "M":
        num_m += 1

# Count # of misplaced books & # of M in large section
for i in range(0, num_l):
    if shelf[i] == "M":
        m_in_l += 1
        misplaced_l += 1
    elif shelf[i] == "S":
        misplaced_l += 1

# Count # of misplaced books & # of L in medium section
for i in range(num_l, num_l + num_m):
    if shelf[i] == "L":
        l_in_m += 1
        misplaced_m += 1
    elif shelf[i] == "S":
        misplaced_m += 1

# Output minimum swaps
print(misplaced_l + misplaced_m - min(m_in_l, l_in_m))
