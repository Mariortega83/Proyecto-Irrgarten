/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author mario
 */
public class Labyrinth {

    private static char BLOCK_CHAR = 'X';
    private static char EMPTY_CHAR = '-';
    private static char MONSTER_CHAR = 'M';
    private static char COMBAT_CHAR = 'C';
    private static char EXIT_CHAR = 'E';
    private static int ROW = 0;
    private static int COL = 1;

    private int nRows;
    private int nCols;
    private int exitRow;
    private int exitCol;
    
    private char[][] monsters;
    private Monster[][] labyrinth;
    private Player[][] players;
    
    

    public Labyrinth(int nRows, int nCols, int exitRow, int exitCol) {
        this.nRows = nRows;
        this.nCols = nCols;
        this.exitRow = exitRow;
        this.exitCol = exitCol;
        
        this.monsters = new char[nRows][nCols];
        this.labyrinth = new Monster[nRows][nCols];
        this.players = new Player[nRows][nCols];
    }

    public void spreadPlayer(Player[] player) {
        throw new UnsupportedOperationException();
    }

    public boolean haveAWinner() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

    public void addMonster(int row, int col, Monster monster) {
        throw new UnsupportedOperationException();
    }

    public Monster putPlayer(Directions direction, Player player) {
        throw new UnsupportedOperationException();
    }

    public void addBlock(Orientation orientation, int startRow, int startCol, int length) {
        throw new UnsupportedOperationException();
    }

    public Directions[] validMoves(int row, int col) {
        throw new UnsupportedOperationException();
    }

    private boolean posOK(int row, int col) {
        throw new UnsupportedOperationException();
    }

    private boolean emptyPos(int row, int col) {
        throw new UnsupportedOperationException();
    }

    private boolean monsterPos(int row, int col) {
        throw new UnsupportedOperationException();
    }

    private boolean exitPos(int row, int col) {
        throw new UnsupportedOperationException();
    }

    private boolean combatPos(int row, int col) {
        throw new UnsupportedOperationException();
    }

    private boolean canStepOn(int row, int col) {
        throw new UnsupportedOperationException();
    }

    private void unpdateOldPos(int row, int col) {
        throw new UnsupportedOperationException();
    }

    private int[] dir2Pos(int row, int col, Directions direction) {
        throw new UnsupportedOperationException();
    }

    private int[] randomEmptyPos() {
        throw new UnsupportedOperationException();
    }

    private Monster putPlayer2D(int oldRow, int oldCol, int row, int col, 
                                Player player) {
        throw new UnsupportedOperationException();
    }
}
