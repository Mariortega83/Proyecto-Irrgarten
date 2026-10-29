/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author mario
 */
public class Backpack {
    
    // TRADUCIR A RUBY
    private static final int TAM_BACK = 2;
    private Weapon[] weapons;
    
    public Backpack() {
        this.weapons = new Weapon[TAM_BACK];
        
        for (int i = 0; i < TAM_BACK; i++) {
            this.weapons[i] = new Weapon();
        }
    }
    
    public Backpack(int uses1, float power1, int uses2, float power2) {
        this.weapons = new Weapon[TAM_BACK];
        
        this.weapons[0] = new Weapon(power1,uses1);
        this.weapons[1] = new Weapon(power2,uses2);
    }
}
