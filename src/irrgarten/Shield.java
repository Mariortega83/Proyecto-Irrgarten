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

    public Shield(float pro, int use) {
        protection = pro;
        uses = use;
    }

    public float protect() {

        float intensidad = protection;
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

    public String toString() {
        String cadena = "S[" + protection + ", " + uses + "]";
        return cadena;
    }

}
