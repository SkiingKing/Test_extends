package com.company;


public class Student extends Human {
    protected String nameOfUniversity;

    public Student(String name, int yearOfBirth,
                   String nameOfUniversity) {
        super(name, yearOfBirth);
        this.nameOfUniversity = nameOfUniversity;
    }

    Student s = new Student("Tom", 19, "KNTY");

    @Override
    public String toString() {
        return "Student" + name + yearOfBirth + nameOfUniversity;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    @Override
    public int hashCode() {
        return s.hashCode() + 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;

        Student g = (Student) obj;
        return this.name.equals(g.name);
    }
}
