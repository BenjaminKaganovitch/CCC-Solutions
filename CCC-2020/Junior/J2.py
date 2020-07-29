# CCC 2020 Junior 2: Epidemiology
#
# Cited directly from the problem: "This problem was designed before the current coronavirus
# outbreak, and we acknowledge the distress currently being experienced by many people worldwide
# because of this and other diseases. We hope that including this problem at this time highlights
# the important roles that computer science and mathematics play in solving real-world problems."
#
# Author: Charles Chen
#
# Calculations and looping

day = 0
target = int(input())
initial = int(input())
spread = int(input())
total_infected = initial

if initial == target:
    print(1)
else:
    while total_infected <= target:
        day += 1
        total_infected += ((spread ** day) * initial)
    print(day)
