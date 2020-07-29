# CCC 2020 Junior 4: Cyclic Shifts
#
# Author: Charles Chen
#
# Strings


# Input
text = input()
shift = input()
contains_shift = False

# Find shifts
for i in range(len(shift)):
    s1 = shift[:i]
    s2 = shift[i:]
    shifted_text = s2 + s1
    if shifted_text in text:
        contains_shift = True
        break

# Output
if contains_shift:
    print("yes")
else:
    print("no")
