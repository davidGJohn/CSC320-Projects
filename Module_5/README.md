Module 5 Critical Thinking

pseudocode for project option 1
________________________________

BEGIN

import java.util.Scanner

// Initialize variables
String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}
double[] temperatures = {72.0, 65.2, 78.0, 62.1, 58.4, 53.6, 67.9}
Scanner scanner = new Scanner(System.in)

WHILE true
    PRINT "Enter a day (Monday-Sunday) or 'week' for full report ('exit' to quit): "
    input <-- scanner.nextLine().toLowerCase()

    IF input == "exit" THEN
        BREAK
    ELSE IF input == "week" THEN
        CALL displayWeeklyReport()
    ELSE
        CALL displayDailyTemperature(input)
    END IF
END WHILE

scanner.close()

END

FUNCTION displayDailyTemperature(day)
    index <-- CALL findDayIndex(day)
    IF index != -1 THEN
        PRINT days[index] + ": " + temperatures[index] + "°F"
    ELSE
        PRINT "Invalid day entered."
    END IF
END FUNCTION

FUNCTION displayWeeklyReport()
    PRINT "Weekly Temperature Report:"
    FOR i = 0 TO days.length - 1
        PRINT days[i] + ": " + temperatures[i] + "°F"
    END FOR
    average <-- CALL calculateAverage(temperatures)
    PRINT "Weekly Average: " + average + "°F"
END FUNCTION

FUNCTION findDayIndex(day)
    FOR i = 0 TO days.length - 1
        IF days[i].equalsIgnoreCase(day) THEN
            RETURN i
        END IF
    END FOR
    RETURN -1
END FUNCTION

FUNCTION calculateAverage(arr)
    sum <-- 0
    FOR EACH value IN arr
        sum <-- sum + value
    END FOR
    RETURN sum / arr.length
END FUNCTION


END