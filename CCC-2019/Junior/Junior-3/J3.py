# CCC 2019 Junior 3: Cold Compress
#
# Author: Charles Chen
#
# In this problem, you must count the amount of times each character
# shows up in a string in order and output it by printing the number
# of times it occurs followed by a space and the character itself. This
# is a compression technique known as run-length encoding.
#
# The algorithm I used involves a nested for loop. The outer loop is used
# to loop through all the strings while the inner loop is used to loop
# through all the characters. If the next character is not equal to the
# current character or if the inner loop has reached the end of a string,
# it will print out the number of times it occurs using a counter variable
# called "new_encounter" followed by the character itself.

new_encounter = -1
sequences = []
num_lines = int(input())

for i in range(num_lines):
    sequences.append(input())

for i in range(num_lines):
    for j in range(len(sequences[i])):
        if j < (len(sequences[i]) - 1):
            if sequences[i][j] != sequences[i][j+1]:
                print(j - new_encounter, sequences[i][j], end=" ")
                new_encounter = j
        else:
            print(j - new_encounter, sequences[i][j])
    new_encounter = -1
