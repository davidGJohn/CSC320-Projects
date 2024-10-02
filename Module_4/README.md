Module 3 Critical Thinking

psuedocode for project option 2
-------------------------------


BEING

import java.util.Scanner

// Initialize variables
Scanner scanner = new Scanner(System.in)
int[] numbers <-- [10]
double sum <-- 0
double max
double min
int sum <-- 0

// Retrieve user input
PRINT "Enter 10 grades between 0 and 100"

FOR I; I < 10; I++
    IF scanner.hasNextDouble
        double grade <-- scanner
        IF grade >= 0 AND <= 100
            sum += grade
            numbers[I] <-- grade
            count <-- count + 1
        ELSE
            PRINT "Invalid grade"
    ELSE
        PRINT "Invalid input"
        I <-- I - 1

    IF count == 10
        break

min = numbers[0]
max = numbers[0]

FOR J in numbers
    IF numbers[j] < min
        min = numbers[j]
    IF numbers[j] > max
        max = numbers[j]

double average <-- sum / count
PRINT "Average: " + average
PRINT "Maximum: " + max
PRINT "Minimum: " + min

END

