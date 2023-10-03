package org.launchcode.techjobs.oo;
import java.util.Objects;
public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }
    // calls the first constructor and initializes id
    public JobField(String value) {
        this(); // calls the first constructor
        this.value = value; // assigns value parameter to value field
    }
    // GETTERS and SETTERS
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return getId() == jobField.getId();
    }
    // gives the id
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
};


