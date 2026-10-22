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
public class Team {
// TRADUCIR A RUBY
    private ArrayList<Player> players;

    public Team() {
        this.players = new ArrayList<>();
    }
    
    public void addPlayer(Player player){
        this.players.add(player);
        player.addTeam(this);
    }

}
