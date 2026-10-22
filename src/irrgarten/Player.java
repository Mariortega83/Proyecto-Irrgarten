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
public class Player {
    
    // Atributos de clase
    private static int MAX_WEAPONS = 2;
    private static int MAX_SHIELDS = 3;
    private static int INITIAL_HEALTH = 10;
    private static int HITS2LOSE = 3;

    // Atributos de relaciones
    private ArrayList<Weapon> weapons;
    private ArrayList<Shield> shields;
    // TRADUCIR A RUBY
    private ArrayList<Team> teams;
    
    // Atributos de clase
    private String name;
    private char number;
    private float intelligence;
    private float strength;
    private float health;
    private int row;
    private int col;
    private int consecutiveHits;

    // Aunque en el diagrama solo salen 3 parametros, hay que inicializar todos
    // los atributos
    public Player(char number, float intelligence, float strength) {
        this.name = "Player #" + number;
        this.number = number;
        this.intelligence = intelligence;
        this.strength = strength;
        this.health = Player.INITIAL_HEALTH;
        this.row = -1;
        this.col = -1;
        this.consecutiveHits = 0;
        this.weapons = new ArrayList<>();
        this.shields = new ArrayList<>();
        
        this.teams = new ArrayList<>();
    }
    
    // Metodo para obtener el ataque total de todas las armas del jugador
    public float sumWeapons(){
        float suma = 0.0f;
        // Bucle for each para los arrays
        for (Weapon weapon : this.weapons) {
            suma += weapon.attack();
        }
        return suma;
    }
    
    public void takeWeapon(Weapon weapon){
        this.weapons.add(weapon);
        // weapon.addPlayer(this);
    }
    // TRADUCIR A RUBY
    public void addTeam(Team team){
        this.teams.add(team);
    }
    
    

  
}
