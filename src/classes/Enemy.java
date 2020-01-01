/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.*;

/**
 *
 * @author Harjap Gill
 */
public class Enemy extends Character{
    private String element;
    
    public Enemy(int location, String name, int hp, int maxhp, int mp, int maxmp, 
            int atk, int df, ArrayList<Item> items, String element) {
            super(location, name, hp, maxhp, mp, maxmp, atk, df, items);
            this.element = element;
    }
    

    
}
