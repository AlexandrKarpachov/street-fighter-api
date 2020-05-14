package ua.karpachov.street_fighter.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Aleksandr Karpachov
 * @version 1.0
 * @since 14.05.2020
 */
@Entity
public class Fighter {
    @Id
    private int id;

    private String name;
    private int wins;

    public Fighter() {
    }

    public Fighter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void incrementWinRate() {
       this.wins++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
