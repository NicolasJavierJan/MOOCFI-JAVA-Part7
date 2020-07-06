/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.ArrayList;

public class Recipe {
    private ArrayList<String> recipes;
    
    public Recipe(){
        this.recipes = new ArrayList<>();
    }
    
    public void add(String string){
        this.recipes.add(string);
    }
    
    public String getName(){
        return this.recipes.get(0);
    }
    
    public String getTime(){
        return this.recipes.get(1);
    }
    
    public boolean getIngredient(String ingredient){
        for (String ingredients : this.recipes){
            if (ingredients.equals(ingredient)){
                return true;
            }
        }
        return false;
    }
}
