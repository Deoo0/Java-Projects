#include <iostream>
#include <vector>

int main()
{
    // Create a vector and initialize it with values
    std::vector<int> myVector = {1, 2, 3, 4, 5};

    // Add a new element to the vector
    myVector.push_back(6);

    // Display the elements of the vector
    std::cout << "Vector elements: ";
    for (const auto &value : myVector)
    {
        std::cout << value << " ";
    }
    std::cout << std::endl;

    // Display the size of the vector
    std::cout << "Vector size: " << myVector.size() << std::endl;

    return 0;
}