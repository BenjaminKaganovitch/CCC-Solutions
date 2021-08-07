# CCC 2021 Junior 2: Silent Auction
#
# Author: Charles Chen
#
# Find max value

names = []
bid_amounts = []
max_index = -1
max = -20000000000

# Input
num_bids = int(input())

# Input bids, while also checking if the bid amount is the max
for i in range(num_bids):
    names.append(input())
    bid_amounts.append(int(input()))
    if bid_amounts[i] > max:
        max = bid_amounts[i]
        maxIndex = i

# Output winner
print(names[maxIndex])
