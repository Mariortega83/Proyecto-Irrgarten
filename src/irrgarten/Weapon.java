/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Weapon {

    private float power;
    private int uses;
    private String[] colores;

    // private ArrayList<Player> players;
    public Weapon(float power, int uses) {
        this.power = power;
        this.uses = uses;
        // this.players = new ArrayList<>();
    }

    public Weapon() {
        this(Dice.weaponPower(), Dice.usesLeft());
    }

    public float attack() {

        float intensidad = power;
        if (uses > 0) {
            uses -= 1;
        } else {
            intensidad = 0;
        }
        return intensidad;
    }

    public boolean discard() {
        return Dice.discardElement(uses);
    }

    /* public void addPlayer(Player player){
        this.players.add(player);
    }
     */
    public String[] getColores() {
        return this.colores.clone();
    }

    public String toString() {
        String cadena = "W[" + power + ", " + uses + "]";
        return cadena;
    }

}
