package com.hibernate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Player;
import model.Team;

/**
 * Purpose: To perform one-to-many(bidirectional) in hibernate using xml.
 * @author : Pushpa Navik
 * @since : 9-06-2018
 * @version: 2.0
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        org.hibernate.Session session=  new Configuration().configure("com/resources/TeamPlayer.config.xml").buildSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        
        Team team=new Team();
        team.setTid(546);
        team.settName("Ind-Cricket");
        
        Player player=new Player();
        player.setPid(101);
        player.setpName("Sachin Tendulkar");
        player.setTid(546);
        player.setpAge(50);
        player.setTeam(team);
        
       Set<Player> saveplayer=new HashSet<Player>();
        saveplayer.add(player);
        team.setPlayer(saveplayer);
       
        session.save(team);
        tx.commit();
        
        
        session.close();
        
        
    }
}
