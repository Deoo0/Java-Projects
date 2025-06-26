import math

def is_prime(n):
    # A number less than 2 is not prime
    if n <= 1:
        return False
    
    # Check for factors from 2 up to the square root of n
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            print(i)
            return False
    
    return True
