import java.util.Scanner;

public class menu {
    
    public static int mainMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose from the following options");

        selection = input.nextInt();

        return selection;

    }
    public static void programStart() {
        System.out.println("--- Syslog Analyser Tool ---");
    }


}
