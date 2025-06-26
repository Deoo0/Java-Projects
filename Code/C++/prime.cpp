#include <iostream>
#include <cmath>

// Function to check whether a number is prime
bool isPrime(int num) {
    if (num <= 1) {
        return false;  // 1 and numbers less than 1 are not prime
    }

    // Check divisibility from 2 to the square root of the number
    for (int i = 2; i <= sqrt(num); ++i) {
        if (num % i == 0) {
            return false;  // If divisible, the number is not prime
        }
    }

    return true;  // If no divisor is found, the number is prime
}

int main() {
    // Get input from the user
    int userInput;
    std::cout << "Enter a positive integer: ";
    std::cin >> userInput;

    // Input validation
    while (userInput <= 0) {
        std::cout << "Please enter a positive integer: ";
        std::cin >> userInput;
    }

    // Check if the entered number is prime
    if (isPrime(userInput)) {
        std::cout << userInput << " is a prime number." << std::endl;
    } else {
        std::cout << userInput << " is not a prime number." << std::endl;
    }

    return 0;
}