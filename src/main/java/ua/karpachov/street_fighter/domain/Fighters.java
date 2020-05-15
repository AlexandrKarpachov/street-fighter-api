package ua.karpachov.street_fighter.domain;

import java.util.List;

/**
 * @author Aleksandr Karpachov
 * @version 1.0
 * @since 15.05.2020
 */
public class Fighters {
    private List<Fighter> fighters;

    public Fighters(List<Fighter> fighters) {
        this.fighters = fighters;
    }

    public List<Fighter> getFighters() {
        return fighters;
    }

    public void setFighters(List<Fighter> fighters) {
        this.fighters = fighters;
    }
}
