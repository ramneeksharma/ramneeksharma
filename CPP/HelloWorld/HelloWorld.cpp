// Simple C++ program to display "Hello World"
 
// Header file for input output functions
#include<iostream>
 
using namespace std;
 
// main function -
// where the execution of program begins
int main()
{
    char username[10];

    // get the name from the user
    cout<<("Enter your name: ");
    scanf("%9s", username);

    // print hello, username
    printf("Hello %s!\n", username);

    return 0;
}
