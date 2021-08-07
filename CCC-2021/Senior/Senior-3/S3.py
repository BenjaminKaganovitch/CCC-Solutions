# CCC 2021 Senior 3: Lunch Concert
# 
# Author: Charles Chen
# 
# The obvious way to approach this problem would be to loop through each possible location
# to hold the concert and to calculate the total walking time for each position. Afterwards,
# you can pick out the smallest walking time. However, this solution is too inefficient to
# receive all 15/15 marks.
# 
# Let's optimize this approach. The first idea to consider is placing an upper and lower
# bound on the possible locations to hold the concert. The logical lower bound would be
# the smallest position of all the friends and the logical upper bound would be the largest
# position of all the friends. This makes sense because when you have more than one friend,
# you should hold the concert somewhere in the middle of all of them to minimize walking
# time. When you have 1 friend, it makes the most logical sense to hold the concert at their
# current location.
# 
# How can we reduce the possible locations even further? When you take the sample inputs and 
# write a program to output the total walking time at each possible location for the concert,
# bounded by the upper and lower bounds, you will notice that the total walking times at each
# extreme are large, but they get smaller as you observe points closer to the center. If you 
# were to graph the walking times at each of the positions, the graph would have a shape 
# similar to a "U".
# 
# Given this, the problem essentially becomes a peak finding problem. We must find a position
# c where the walking times on both sides are greater than or equal to the walking time at c.
# Using a divide and conquer approach, we can continually halve the number of possible
# locations for c. This approach is a lot more efficient and will give us 15/15 marks.

def calculate_time(pos, sp, dist, concert):
    total_time = 0
    for i in range(len(pos)):
        total_distance = abs(concert - pos[i])
        if total_distance > dist[i]:
            min_travel = total_distance - dist[i]
            total_time += min_travel * sp[i]
    return total_time

# Initialize variables
min_pos = 20000000000
max_pos = -20000000000
min_time = -1
positions = []
speeds = []
max_distances = []

# Input
num_friends = int(input())
for i in range(num_friends):
    values = list(map(int, input().split(" ")))
    positions.append(values[0])
    speeds.append(values[1])
    max_distances.append(values[2])

    if positions[i] < min_pos:
        min_pos = positions[i]
    if positions[i] > max_pos:
        max_pos = positions[i]

# Use a divide and conquer approach to find c
left = min_pos
right = max_pos
while left <= right:
    mid = (left + right) // 2
    mid_time = calculate_time(positions, speeds, max_distances, mid)
    mid_right_time = calculate_time(positions, speeds, max_distances, mid + 1)
    mid_left_time = calculate_time(positions, speeds, max_distances, mid - 1)

    if mid_time <= mid_right_time and mid_time <= mid_left_time:
        min_time = mid_time
        break
    elif mid_time <= mid_right_time:
        right = mid - 1
    else:
        left = mid + 1

# Output min_time
print(min_time)
