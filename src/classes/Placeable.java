/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Harjap Gill
 */
public abstract class Placeable {
    
    private int location;
    private String name;
    
    public Placeable(int location,String name) {
        this.location = location;
        this.name = name;
    }
    
    public int getPosition() {
        return location;
    }
    
    public String getName(){
        return name;
    }
    
    public void setLocation(int location) {
        this.location = location;
    }
    
}
