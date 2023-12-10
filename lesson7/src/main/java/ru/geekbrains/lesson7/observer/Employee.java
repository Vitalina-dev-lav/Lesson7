package ru.geekbrains.lesson7.observer;

public abstract class Employee implements Observer {
    protected String name;
    protected String surName;

    public Employee(String surName, String name) {
        this.surName = surName;
        this.name = name;
    }
}
