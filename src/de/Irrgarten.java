/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de;

import irrgarten.Backpack;
import irrgarten.Dice;
import irrgarten.Directions;
import irrgarten.Weapon;
import irrgarten.Player;
import irrgarten.Team;

/**
 *
 * @author mario
 */
public class Irrgarten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] colores1 = {"Rojo"};
        // PRUEBAS PRACTICA 2
        Player p1 = new Player('1', Dice.randomIntelligence(), Dice.randomStrength());
        Weapon armap1 = new Weapon(2.3f, 6);
        Weapon armap2 = new Weapon(2.3f, 6);
        
        p1.takeWeapon(armap1);
        p1.takeWeapon(armap2);
        System.out.println(p1.sumWeapons());
        
        // TODO code application logic here
        Directions arriba = Directions.UP;

        System.out.println(arriba);

        
        Weapon arma = new Weapon(2.3f, 6);

        float ale = 0.0f;
        for (int i = 0; i < 10; i++) {

            ale = Dice.randomIntelligence();
            System.out.println(ale);
        }

        int ale1 = 0;

        for (int i = 0; i < 10; i++) {

            ale1 = Dice.usesLeft();
            System.out.println(ale1);
        }

        // Ejercicio de examen, los atributos de clase privados no pueden ser
        // accedidos de otra forma, hacerlos publicos NO ES UNA SOLUCION
        // Ponerlo en PUBLIC FINAL ... tambien se puede, pero mejor la otra opcion
        System.out.println("MAX_USES = " + Dice.getMaxUses());

        String[] colors = arma.getColores();

        colors[0] = "Amarillo";
        System.out.println(colors[0]);
        
        
        System.out.println("-------------------------------------");
        System.out.println("------------ PRUEBA 2 ---------------");
        System.out.println("-------------------------------------");
        
        Team equipo = new Team();
        equipo.addPlayer(p1);
        // p1.addTeam(equipo);
        
        Backpack mochila = new Backpack();
        

    }

}
