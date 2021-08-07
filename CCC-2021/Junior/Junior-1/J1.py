# CCC 2021 Junior 1: Boiling Water
# 
# Author: Charles Chen
# 
# Calculation and if statement

# Input
temperature = int(input())

# Calculate pressure
pressure = 5 * temperature - 400
print(pressure)

# Determine location relative to sea level
if pressure > 100:
    print(-1) # Below sea level
elif pressure == 100:
    print(0) # At sea level
else:
    print(1) # In this case, pressure < 100 and it's above sea level
