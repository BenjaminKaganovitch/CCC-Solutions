# CCC 2020 Junior 1: Dog Treats
#
# Author: Charles Chen
#
# Straight forward calculation and if else structure

small = int(input())
medium = int(input())
large = int(input())

happiness = (3 * large) + (2 * medium) + small
if happiness >= 10:
    print("happy")
else:
    print("sad")
