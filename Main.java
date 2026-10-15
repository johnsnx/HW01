import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//Declarations
String playerA;
String playerB;
System.out.println("Player A, enter R, P, or S: ");
playerA = input.nextLine();
if (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S")) {
    System.out.println("Invalid choice for Player A!");
    System.exit(0);}

    System.out.print("Player B, enter R, P, or S: ");
    playerB = input.nextLine();

    if (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S")) {
        System.out.println("Invalid choice for Player B!");
        System.exit(0);}

        playerA = playerA.toUpperCase();
        playerB = playerB.toUpperCase();

        if (playerA.equals(playerB)) {
            System.out.println("It's a Tie!");
        } else if ((playerA.equals("R") && playerB.equals("S")) || (playerA.equals("P") && playerB.equals("R")) || (playerA.equals("S") && playerB.equals("P"))) {
            if (playerA.equals("R")) {
                System.out.println("Rock breaks Scissors.");
            } else if (playerA.equals("P")) {
                System.out.println("Paper covers Rock.");
            } else {
                System.out.println("Scissors cuts Paper."); }
            System.out.println("Player A wins!");
        } else {
            if (playerB.equals("R")) {
                System.out.println("Rock breaks Scissors.");
            } else if (playerB.equals("P")) {
                System.out.println("Paper covers Rock.");
            } else {
                System.out.println("Scissors cuts Paper."); }
            System.out.println("Player B wins!");
        }}}