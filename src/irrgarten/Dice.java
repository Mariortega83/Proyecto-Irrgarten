/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.Random;

/**
 *
 * @author mario
 */
public class Dice {

    private static int MAX_USES = 5;
    private static float MAX_INTELLIGENCE = 10.0f;
    private static float MAX_STRENGTH = 10.0f;
    private static float RESURRECT_PROB = 0.3f;
    private static int WEAPONS_REWARD = 2;
    private static int SHIELDS_REWARD = 3;
    private static int HEALTH_REWARD = 5;
    private static float MAX_ATTACK = 3.0f;
    private static float MAX_SHIELD = 2.0f;

    private static Random generator = new Random();

    // Generadores
    private static int generadorEntero(int max) {
        return Dice.generator.nextInt(max);
    }

    private static float generadorFloat() {
        return Dice.generator.nextFloat();
    }

    public static int randomPos(int max) {
        return Dice.generadorEntero(max);
    }

    public static int whoStarts(int nPlayers) {
        return (Dice.generadorEntero(nPlayers + 1));
    }

    public static float randomIntelligence() {
        return (Dice.generadorFloat() * Dice.MAX_INTELLIGENCE);
    }

    public static float randomStrength() {
        return (Dice.generadorFloat() * Dice.MAX_STRENGTH);
    }

    public static boolean resurrectPlayer() {
        return Dice.generadorFloat() < Dice.RESURRECT_PROB;
    }

    public static int weaponsReward() {
        return Dice.generadorEntero(Dice.WEAPONS_REWARD + 1);
    }

    public static int shieldsReward() {
        return Dice.generadorEntero(Dice.SHIELDS_REWARD + 1);
    }

    public static int healthReward() {
        return Dice.generadorEntero(Dice.HEALTH_REWARD + 1);
    }

    public static float weaponPower() {
        return (Dice.generadorFloat() * Dice.MAX_ATTACK);
    }
    
    public static float shieldPower() {
        return (Dice.generadorFloat() * Dice.MAX_SHIELD);
    }

    public static int usesLeft() {
        return Dice.generadorEntero(Dice.MAX_USES + 1);
    }
    
    public static float intensity(float competence){
        return (Dice.generadorFloat() * competence);
    }
    
    public static boolean discardElement(int usesLeft){
        return (Dice.generadorFloat() * usesLeft) < Dice.MAX_USES;
    }

    // Ejercicio tipo examenx 
    public static int getMaxUses() {
        return Dice.MAX_USES;
    }

}
