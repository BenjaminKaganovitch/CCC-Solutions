# CCC 2018 Junior 2: Occupy parking
#
# Author: Charles Chen
#
# String index checking

parking_spaces = int(input())
yesterday = input()
today = input()

counter = 0  # Counter used to track parking spaces occupied both days

for i in range(parking_spaces):
    if yesterday[i] == today[i] == 'C':
        counter += 1

print(counter)
