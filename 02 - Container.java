/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Container {
    private int container;
    
    public Container(){
        this.container = 0;
    }
    
    public int contains(){
        return this.container;
    }
    
    public void add(int amount){
        if (amount > 0){
            this.container = this.container + amount;
            if (this.container > 100){
                this.container = 100;
            }
        }
    }
    
    public void remove(int amount){
        if (amount > 0){
            this.container = this.container - amount;
            if (this.container < 0){
                this.container = 0;
            }
        }
    }
    
    public String toString(){
        return this.container + "/100";
    }
}
