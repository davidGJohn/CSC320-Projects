6 Portfolio Milestone

Pseudocode for Automobile Inventory System (Option 1)

______________________

BEGIN

Automobile()
    Initialize all attributes to default values

Automobile(String make, String model, String color, int year, int mileage)
    Set all attributes to provided values

void addNewVehicle(String make, String model, String color, int year, int mileage)
    IF vehicle doesn't exist in inventory
        Create new Automobile object with provided details
        Add to inventory
    ELSE
        PRINT "Vehicle already exists"

String[] listVehicleInformation()
    Create String array with all vehicle attributes
    RETURN array

String removeVehicle(String make, String model, String color, int year, int mileage)
    IF values entered match values stored in private variables
        Remove vehicle information
        RETURN "Vehicle removed successfully"
    ELSE
        RETURN "Vehicle not found in inventory"

void updateVehicleAttributes(String make, String model, String color, int year, int mileage)
    IF vehicle exists in inventory
        Update attributes with provided values
    ELSE
        PRINT "Vehicle not found in inventory"

END