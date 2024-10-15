6 Portfolio Milestone

Pseudocode for Automobile Inventory System (Option 1)

______________________

BEGIN

Automobile()
    Initialize all attributes to default values

Automobile(String make, String model, String color, int year, int mileage)
    Set all attributes to provided values

void addNewVehicle(String make, String model, String color, int year, int mileage)
    If vehicle doesn't exist in inventory
        Create new Automobile object with provided details
        Add to inventory
    Else
        Print "Vehicle already exists"

String[] listVehicleInformation()
    Create String array with all vehicle attributes
    Return array

String removeVehicle(String make, String model, String color, int year, int mileage)
    If values entered match values stored in private variables
        Remove vehicle information
        Return "Vehicle removed successfully"
    Else
        Return "Vehicle not found in inventory"

void updateVehicleAttributes(String make, String model, String color, int year, int mileage)
    If vehicle exists in inventory
        Update attributes with provided values
    Else
        Print "Vehicle not found in inventory"

END