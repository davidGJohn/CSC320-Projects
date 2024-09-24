Module 3 Critical Thinking
---------------------------

Psuedocode for project:

BEGIN
    // Import Java.util.Scanner
    // Create a scanner object
    Scanner scnr = new Scanner(System.in)
    
    // Initialize variables
    int income
    double taxRate
    double taxWithholding

    // Obtain user input
    PRINT "Please enter your weekly income: $"
    income = scnr.nextInt()

    // Calculate tax rate based on income
    IF income < 500 THEN
        taxRate = 0.10
    ELSE IF income >= 500 AND income < 1500 THEN
        taxRate = 0.15
    ELSE IF income >= 1500 AND income < 2500 THEN
        taxRate = 0.20
    ELSE
        taxRate = 0.30
    END IF

    // Calculate tax withholding
    taxWithholding = income * taxRate

    // Display results
    PRINT "For a weekly income of $", income
    PRINT "Your tax withholding is $", taxWithholding

    // Close scanner
    scnr.close()
END