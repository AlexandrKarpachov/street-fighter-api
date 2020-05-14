package ua.karpachov.street_fighter.controllers;

/**
 * @author Aleksandr Karpachov
 * @version 1.0
 * @since 14.05.2020
 */
public class SomeData {
    private int id;
    private String name;

    public SomeData(int id, String name) {
        this.id = id;
        this.name = name;
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
}
