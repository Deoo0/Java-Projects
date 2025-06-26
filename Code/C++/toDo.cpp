#include <iostream>
#include <cstring>
#include <vector>

using namespace std;

// Global Variables
vector<string> tasks;
vector<string> tasksDes;
int i = 0;

// Functions    
void addTask()
{
    string taskName, taskDes;

    cout << "Enter task name: ";
    cin >> taskName;
    tasks.push_back(taskName);

    cout << "Enter task description: ";
    cin >> taskDes;
    tasksDes.push_back(taskDes);

    cout << "\nTask added successfully\n\n";
}

void markTask()
{
    int index;
    cout << "Enter the index of the task to mark as completed: ";
    cin >> index;
    int finalIndex = index - 1;
    cout << "Task \"" << tasks[finalIndex] << "\""
         << " has been marked as complete.\n\n";

    auto it = tasks.begin() + finalIndex;
    tasks.erase(it);
}

void viewToDo()
{

    cout << "To Do List: \n";
    for (size_t i = 0; i < tasks.size(); ++i)
    {
        cout << " - Task Name: [  ] " << tasks[i] << "\n                Task Description:" << tasksDes[i] << "\n\n";
    }
}

void quit()
{
    quit();
}

void mainMenu()
{
    while (true)
    {
        cout << "Main Menu:" << endl;
        cout << "1. Add a task\n2. Mark a task as complete\n3. View the to-do list\n4. Quit\n\n";

        cout << "Enter your choice: ";
        int choice;
        cin >> choice;
        if (choice == 1)
        {
            addTask();
        }
        else if (choice == 2)
        {
            markTask();
        }
        else if (choice == 3)
        {
            viewToDo();
        }
        else if (choice == 4)
        {
            quit();
        }
    }
}

int main()
{

    cout << "Welcome to the To-Do List application\n"
         << endl;

    mainMenu();
}