package ru.geekbrains.lesson7.observer;

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(String companyName, ru.geekbrains.lesson7.factory.EmployeeType employeeType, JobType jobType, int salary);


}
