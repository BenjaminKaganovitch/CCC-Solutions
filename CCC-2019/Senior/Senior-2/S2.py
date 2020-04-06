# CCC 2019 Senior 2: Pretty Average Primes
#
# Author: Charles Chen
#
# This problem involves finding 2 prime numbers, A and B, such that N is the average of A and B. Mathematically,
# we can express this as N = (A + B) / 2. Notice how we can rearrange this equation to 2N = A + B.
#
# To solve this, we will construct a function to determine if a given number is prime. For improved efficiency,
# you only need to check up to the square root of the given number to determine if it is prime or not.
#
# We will use a loop variable j which starts at 2 in order to find A and B which have a sum of 2N. If we
# find a j that is prime and we see that (2N - j) is also prime, we have found our A and B.

from math import sqrt


def is_prime(n):
    stop = int(sqrt(n)) + 1
    for k in range(2, stop):
        if n % k == 0:
            return False
    return True


numbers = []
num_lines = int(input())

for i in range(num_lines):
    numbers.append(int(input()))

doubled = 0
for i in range(num_lines):
    doubled = numbers[i] * 2
    for j in range(2, doubled):
        if is_prime(j) and is_prime(doubled - j):
            print(j, doubled - j)
            break
