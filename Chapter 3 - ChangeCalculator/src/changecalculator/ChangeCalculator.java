/**     ___  ___       ___   _____       ___   _   _    _  
*      /   |/   |     /   | /  ___/     /   | | | / /  | | 
*     / /|   /| |    / /| | | |___     / /| | | |/ /   | | 
*    / / |__/ | |   / / | | \___  \   / / | | | |\ \   | | 
*   / /       | |  / /  | |  ___| |  / /  | | | | \ \  | | 
*  /_/        |_| /_/   |_| /_____/ /_/   |_| |_|  \_\ |_| 
*
* 
*/
package changecalculator;

/**
 *
 * @author Masaki Takahashi
 * Course Name: CITP 190 
 * Source: AreaOfRectangle.java
 * Project Name: Workbook 3-4
 * Description: The application displays the minimum number of quarters, dimes, nickels, and
pennies that represent the coins that make up the specified number of cents
 */
import java.util.Scanner;
public class ChangeCalculator {
 public static void main(String[] args) {
    
final int QUARTERS = 25;
final int DIMES = 10;
final int NICKELS = 5;

String choice = "y";
while (choice.equalsIgnoreCase("y")) {

    int totalQuarters = 0;
    int totalDimes = 0;
    int totalNickels = 0;
    int totalPennies = 0;

//Welcome statement to the user.
System.out.println("Welcome to the Change Calculator");
System.out.println();

//Have the user enter the number of cents.
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of cents (0-99): ");
int cents = sc.nextInt();

//Calculate the results.
if (cents >= 25) {
totalQuarters = cents / QUARTERS;
cents = cents % QUARTERS;
}
if (cents >= 10) {
totalDimes = cents / DIMES;
cents = cents % DIMES;
}
if (cents >= 5) {
totalNickels = cents / NICKELS;
cents = cents % NICKELS;
}
if (cents >= 1) {
totalPennies = cents;
}

//Format and display the results.
String message =
"Quarters: " + totalQuarters + "\n"
+ "Dimes: " + totalDimes + "\n"
+ "Nickels: " + totalNickels + "\n"
+ "Pennies: " + totalPennies;
System.out.println(message);

//See if the user wants to continue.
System.out.print("Continue? (y/n) : ");
choice = sc.next();
System.out.println();
}
}
}
