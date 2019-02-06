package com.company;

public class Human {
    protected final String name;
    protected final int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    Human h = new Human("Alex", 18);


    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Human" + name + yearOfBirth;
    }

    @Override
    public int hashCode() {

        return 10 * h.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Human)) return false;

        Human p = (Human) obj;
        return this.name.equals(p.name);
    }
}
