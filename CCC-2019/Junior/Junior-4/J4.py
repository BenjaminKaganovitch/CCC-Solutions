# CCC 2019 Junior 4/Senior 1: Flipper
#
# Author: Charles Chen
#
# This problem involves a 2x2 matrix, and swapping the values of variables.
# To solve this problem, declare a 2x2 array and set the values of the
# respective positions according to the problem. Then, loop through all the
# characters and perform a horizontal flip is it is 'H' and perform a vertical
# flip otherwise.
#
# A horizontal flip is simply swapping the values of the top left and bottom
# left and also swapping the values of the top right and bottom right. A
# vertical flip is swapping the values of the top left and top right and also
# swapping the values of the bottom left and bottom right.

original = [[1, 2],
            [3, 4]]

flips = input()

for i in range(len(flips)):
    if flips[i] == 'H':
        original[0][0], original[1][0] = original[1][0], original[0][0]
        original[0][1], original[1][1] = original[1][1], original[0][1]
    else:
        original[0][0], original[0][1] = original[0][1], original[0][0]
        original[1][0], original[1][1] = original[1][1], original[1][0]

print(original[0][0], original[0][1])
print(original[1][0], original[1][1])
