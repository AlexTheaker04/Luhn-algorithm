import java.util.Scanner;
// More packages may be imported in the space below

class CustomerSystem {
    public static void main(String[] args) {
        // Please do not edit any of these variables
        Scanner reader = new Scanner(System.in);
        String userInput, enterCustomerOption, generateCustomerOption, exitCondition;
        enterCustomerOption = "1";
        generateCustomerOption = "2";
        exitCondition = "9";

        // More variables for the main may be declared in the space below

        do {
            printMenu(); // Printing out the main menu
            userInput = reader.nextLine(); // User selection from the menu

            if (userInput.equals(enterCustomerOption)) {
                // Only the line below may be edited based on the parameter list and how you
                // design the method return
                enterCustomerInfo();
            } else if (userInput.equals(generateCustomerOption)) {
                // Only the line below may be edited based on the parameter list and how you
                // design the method return
                generateCustomerDataFile();
            } else {
                System.out.println("Please type in a valid option (A number from 1-9)");
            }

        } while (!userInput.equals(exitCondition)); // Exits once the user types

        System.out.println("Program Terminated");
        reader.close();

    }

    public static void printMenu() {
        System.out.println("Customer and Sales System\n".concat("1. Enter Customer Information\n")
                .concat("2. Generate Customer data file\n").concat("3. Report on total Sales (Not done in this part)\n")
                .concat("4. Check for fraud in sales data (Not done in this part)\n").concat("9. Quit\n")
                .concat("Enter menu option (1-9)\n"));
    }

    /*
     * This method may be edited to achieve the task however you like. The method
     * may not necessarily be a void return type
     */
    public static void enterCustomerInfo() {
    }

    /*
     * This method may be edited to achieve the task however you like. The method
     * may not necessarily be a void return type
     */
    public static void validatePostalCode() {
    }

    /*
     * This method may be edited to achieve the task however you like. The method
     * may not necessarily be a void return type
     */
    public static void validateCreditCard() {
    }

    /*
     * This method may be edited to achieve the task however you like. The method
     * may not necessarily be a void return type
     */
    public static void generateCustomerDataFile() {
    }
    /*******************************************************************
     * ADDITIONAL METHODS MAY BE ADDED BELOW IF NECESSARY *
     *******************************************************************/

}
