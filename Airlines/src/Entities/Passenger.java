package Entities;

import java.io.Serializable;

public class Passenger implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int idCounter=1;
    private final int id;
    private final String name;
    private final String surname;

    public Passenger( String name, String surname) {
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public Passenger(int id, String name, String surname) {
        idCounter=id;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
