/**
 * Program that prints out a person's name and address
 * The information is all printed out on seperate lines 
 * 
 * @author David John
 * 
 */
public class CharacterInfo {
    
    /**
     * Main method 
     * @param args
     */
    public static void main(String[] args) {
        String firstName = "David";
        String lastName = "John";
        String streetAddress = "123 Main Street";
        String city = "Raleigh";
        String zipCode = "12345";

        System.out.println("First name: " + firstName + "\n" + "Last name: " + lastName + "\n"+ "Address: " + 
            streetAddress + "\n" + "City: " + city + "\n" + "Zip code: " + zipCode);
    }
}

