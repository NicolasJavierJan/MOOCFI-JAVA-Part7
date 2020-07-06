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

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner, ArrayList birds){
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public boolean birdExists(String name){
        for (int i = 0; i < this.birds.size(); i++){
            if (name.equals(this.birds.get(i).getName())){
                return true;
            }
        }
        return false;
    }
    
    public void add(){
        System.out.print("Name: ");
        String name = this.scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = this.scanner.nextLine();
        if (birdExists(name) == false){
            Bird newBird = new Bird(name, latinName);
            this.birds.add(newBird);
        }
    }
    
    public void observation(){
        System.out.print("Bird? ");
        String name = this.scanner.nextLine();
        if (this.birdExists(name) == false){
            System.out.println("Not a bird!");
        } else {
            for (int i = 0; i < this.birds.size(); i++){
                if (name.equals(this.birds.get(i).getName())){
                    this.birds.get(i).addObservation();
                    System.out.println(this.birds.get(i).getObservation());
                }
            }
        }
    }
    
    public void all(){
        for (int i = 0; i < this.birds.size(); i++){
            Bird currentBird = this.birds.get(i);
            System.out.println(currentBird.getName() + " (" + currentBird.getLatinName() + "): " + currentBird.getObservation() + " observations");
        }
    }
    
    public void one(){
        System.out.print("Bird? ");
        String name = this.scanner.nextLine();
        for (int i = 0; i < this.birds.size(); i++){
            if (this.birds.get(i).getName().equals(name)){
                Bird currentBird = this.birds.get(i);
                System.out.println(currentBird.getName() + " (" + currentBird.getLatinName() + "): " + currentBird.getObservation() + " observations"); 
            }
        }
    }
}
