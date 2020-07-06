/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public void addObservation(){
        this.observations = this.observations + 1;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getObservation(){
        return this.observations;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
}
