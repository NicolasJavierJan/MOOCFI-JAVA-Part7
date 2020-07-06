/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    
    public UserInterface(Scanner scanner, ArrayList recipes){
        this.scanner = scanner;
        this.recipes = recipes;
    }
    
    public void start(){
        System.out.print("File to read: ");
        String file = this.scanner.nextLine();
        this.readFile(file);
    }
    
    public void readFile(String file){
        Recipe recipe = new Recipe();
        try (Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                if (line.isEmpty()){
                    this.recipes.add(recipe);
                    recipe = new Recipe();
                    continue;
                }
                recipe.add(line);
            }
            this.recipes.add(recipe);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void list(){
        System.out.println("");
        System.out.println("Recipes: ");
        for (int i = 0; i < recipes.size(); i++){
            System.out.println(this.recipes.get(i).getName() + ", cooking time: " + this.recipes.get(i).getTime());
        }
        System.out.println("");        
    }
    
    public void findName(){
        System.out.print("Searched word: ");
        String word = this.scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes: ");
        for (int i = 0; i < this.recipes.size(); i++){
            if (this.recipes.get(i).getName().contains(word)){
                System.out.println(this.recipes.get(i).getName() + ", cooking time: " + this.recipes.get(i).getTime());
            }
        }
        System.out.println("");
    }
    
    public void findCookingTime(){
        System.out.print("Max cooking time: ");
        int time = Integer.valueOf(this.scanner.nextLine());
        System.out.println("");
        System.out.println("Recipes: ");
        for (int i = 0; i < this.recipes.size(); i++){
            if (Integer.valueOf(this.recipes.get(i).getTime()) <= time){
                System.out.println(this.recipes.get(i).getName() + ", cooking time: " + this.recipes.get(i).getTime());
            }
        }
        System.out.println("");
    }
    
    public void findIngredient(){
        System.out.print("Ingredient: ");
        String ingredient = this.scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes: ");
        for (int i = 0; i < this.recipes.size(); i++){
            if (this.recipes.get(i).getIngredient(ingredient) == true){
                System.out.println(this.recipes.get(i).getName() + ", cooking time: " + this.recipes.get(i).getTime());  
            }
        }
        System.out.println("");
    }
}
