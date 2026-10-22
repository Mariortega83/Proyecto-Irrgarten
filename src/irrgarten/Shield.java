/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author mario
 */
public class Shield {

    private float protection;
    private int uses;

    public Shield(float protection, int uses) {
        this.protection = protection;
        this.uses = uses;
    }

    public float protect() {

        float intensidad = this.protection;
        if (this.uses > 0) {
            this.uses -= 1;
        } else {
            intensidad = 0;
        }
        return intensidad;
    }

    public boolean discard() {
        return Dice.discardElement(this.uses);
    }

    public String toString() {
        String cadena = "S[" + this.protection + ", " + this.uses + "]";
        return cadena;
    }

}
