
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
public abstract class Character extends Placeable{
    
    private int hp;
    private int maxhp;
    private int mp;
    private int maxmp;
    private int atk;
    private int atkh;
    private int atkl;
    private int df;
    private ArrayList<Item> items;
    
    private Room room;
    private Random r;
    
    public Character(int location, String name, int hp, int maxhp, int mp, 
            int maxmp, int atk, int df, ArrayList<Item> items) {
        
        super(location,name);
        
        this.hp = hp;
        this.maxhp = maxhp;
        this.mp = mp;
        this.maxmp = maxmp;
        this.atk = atk;
        this.atkh = atk +10 ;
        this.atkl = atkl - 10;
        this.df = df;
        this.items = items;
        this.room = null;
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public int generateDamage() {
        // random nuimber between atkh and atkl
        return (r.nextInt(atkh-atkl +1)+atkl);
    }
    
    public void takeDamage(int dmg) {
        hp -= dmg;
    }
    
    public void heal(int heal) {
        hp += heal;
    }
    
    public int getHp() {
        return hp;
    }
    
    public int getMaxHp() {
        return maxhp;
    }
    
    public int getMp() {
        return mp;
    }
    
    public int getMaxMp() {
        return maxmp; 
    }
    
    public void reduceMp(int MpUsed) {
        mp -= MpUsed;
    }
    
    public void addMp(int mp) {
        this.mp += mp;
    }
            
}
