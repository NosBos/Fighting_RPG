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
public class Player extends Character{
    
    public Player(int location, String name, int hp, int maxhp, int mp, int maxmp, 
            int atk, int df, ArrayList<Item> items) {
        
            super(location, name, hp, maxhp, mp, maxmp, atk, df, items);
       
    }
    
}
