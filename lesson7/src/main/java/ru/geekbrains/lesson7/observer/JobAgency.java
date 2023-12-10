package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, EmployeeType employeeType, JobType jobType, int salary) {
        for (Observer observer : observers) {
            if (observer.getClass().getName().equals("observer." + employeeType.toString()))
                observer.receiveOffer(companyName, jobType, salary);
        }
    }
}
