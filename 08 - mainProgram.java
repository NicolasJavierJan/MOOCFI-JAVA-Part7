
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        UserInterface ui = new UserInterface(scan, birds);
        
        while (true){
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Add")){
                ui.add();
            }
            if (command.equals("Observation")){
                ui.observation();
            }
            if (command.equals("All")){
                ui.all();
            }
            if (command.equals("One")){
                ui.one();
            }
            if (command.equals("Quit")){
                break;
            }
        }

    }

}
