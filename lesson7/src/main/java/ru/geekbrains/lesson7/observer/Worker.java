package ru.geekbrains.lesson7.observer;

public class Worker extends Employee {
    private String surName;
    private String name;
    private int salary = 20000;

    public Worker(String surName, String name) {
        super(surName, name);
        this.surName = surName;
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, JobType jobType, int salary) {
        System.out.println("Рабочий реагирует");
        switch (jobType) {
            case Cleaner:
                if (this.salary <= salary) {
                    System.out.printf("Рабочий %s %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Рабочий %s %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                }
                break;
            case Security:
                if (this.salary <= salary) {
                    System.out.printf("Рабочий %s %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Рабочий %s %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                }
                break;
            default:
                break;
        }

    }

}
