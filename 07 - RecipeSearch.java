import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        UserInterface ui = new UserInterface(scanner, recipes);
        
        ui.start();
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");     
        while(true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("list")){
                ui.list();
            }
            if (command.equals("stop")){
                break;
            }
            if (command.equals("find name")){
                ui.findName();
            }
            if (command.equals("find cooking time")){
                ui.findCookingTime();
            }
            if (command.equals("find ingredient")){
                ui.findIngredient();
            }
        }
    }

}
