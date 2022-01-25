
/**
 * Lab 01 - Temperature: convert C to F, or F to C.
 *
 * @author Hailey M. Wendt
 * @version 1.0 - 25 Jan 2022
 */

import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args){
        // Define our variables
        double inTemp;
        String inUnit;
        double outTemp;
        String outUnit;
        final String FAHRENHEIT = "F";
        final String CELSIUS = "C";
        final char DEGREE = '\u00B0'; // Unicode for degree symbol
        
        // Create our scanner object for obtaining user input
        Scanner in = new Scanner(System.in);
        
        // Prompt user for temperature input of the form: number letter
        // Assuming correct input, with letter being either F or C
        System.out.print("Enter temperature to convert: ");
        
        // Read the user's (assumed to be correct) input. Note that the Scanner class cannot
        // read in individual characters, so we'll read the unit as a string...
        inTemp = in.nextDouble();
        inUnit = in.next();
        
        // Perform the conversion - Note how string comparison is performed...
        if(inUnit.equals(FAHRENHEIT)){
            outTemp = 5.0 / 9.0 * (inTemp - 32.0);
            outUnit = CELSIUS;
        }
        else{
            outTemp = 9.0 / 5.0 * inTemp + 32.0;
            outUnit = FAHRENHEIT;
        }
        
        // Display result through use of formatted output. See Table 2.8.1 for more details.
        // REMEMBER: printf statements are your friends!!!
        System.out.printf("%.1f%c%s = %.1f%c%s\n", inTemp, DEGREE, inUnit, outTemp, DEGREE, outUnit);
        
    }
}
