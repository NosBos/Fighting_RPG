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
public class Room {
    private ArrayList<Character> players;
    private ArrayList<Character> enemies;
    private ArrayList<Item> items;
    
    public Room(ArrayList<Character> players, ArrayList<Character> enemies, ArrayList<Item> items) {
        this.players = players;
        this.enemies = enemies;
        this.items = items;
    }
    
    public void addPlayer(Character player, int location) {
        players.add(player);
        player.setLocation(location);
    }
    
    public void addEnemy(Character enemy, int location) {
        enemies.add(enemy);
        enemy.setLocation(location);
    }
    
    public void addItem(Item item, int location) {
        items.add(item);
        item.setLocation(location);
    }
    
    public boolean removePlayer(Character player, int location) {
        if (player.getPosition() == location) {
             if (players.remove(player)) {
                return true;
            }
        } 
        return false;
        
    }
    
     public boolean removeEnemy(Character enemy , int location) {
        if (enemy.getPosition() == location) {
             if (enemies.remove(enemy)) {
                return true;
            }
        } 
        return false;
        
    }
    
     public boolean removeItem(Item item, int location) {
        if (item.getPosition() == location) {
            if (items.remove(item)) {
                return true;
            }
        } 
        return false;
        
    }
    
    public void printPlayers() {
        String s = "";
        s += "The players in the Room are: \n";
        for (Character player: players) {
            s += player.getName() + "\n";
        }
        System.out.println(s);
    }
    
    public void printItems() {
        String s = "";
        s += "The items in the room are: \n";
        for (Item item: items) {
            s += item.getName() + "\n";
        }
        System.out.println(s);
    }
}
