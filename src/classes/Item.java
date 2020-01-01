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
public abstract class Item extends Placeable{
    private String element;
    private int strength;
    
    public Item(int location, String name, String element, int strength) {
        super(location, name);
        this.element = element;
        this.strength=strength;
        
    }
    
    public abstract boolean use(Player playerFrom, Player playerTo);
        
    
    
    
}
