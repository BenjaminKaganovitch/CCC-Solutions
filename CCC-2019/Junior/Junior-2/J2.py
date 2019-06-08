# CCC 2019 Junior 2: Time to Decompress
#
# Author: Charles Chen
#
# Strings and loops

num_lines = int(input())
num_symbols = []
symbol_type = []

for i in range(num_lines):
    input_data = input().split()
    num_symbols.append(int(input_data[0]))
    symbol_type.append(input_data[1])

for i in range(num_lines):
    print(symbol_type[i] * num_symbols[i])
