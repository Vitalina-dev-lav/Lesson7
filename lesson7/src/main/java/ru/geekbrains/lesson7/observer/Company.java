package ru.geekbrains.lesson7.observer;

import java.util.Random;

import ru.geekbrains.lesson7.factory.EmployeeType;

public class Company {

    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    private int maxSalary;


    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(EmployeeType employeeType, JobType jobType){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, employeeType, jobType, salary);
    }

}
