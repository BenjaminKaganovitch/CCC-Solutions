# CCC 2019 Junior 1: Winning Score
#
# Author: Charles Chen
#
# Straight forward calculation and else if structure

apple3 = int(input())
apple2 = int(input())
apple1 = int(input())

banana3 = int(input())
banana2 = int(input())
banana1 = int(input())

apple_score = (3 * apple3) + (2 * apple2) + apple1
banana_score = (3 * banana3) + (2 * banana2) + banana1

if apple_score > banana_score:
    print("A")
elif banana_score > apple_score:
    print("B")
else:
    print("T")
