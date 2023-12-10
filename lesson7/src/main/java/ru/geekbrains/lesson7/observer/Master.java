package ru.geekbrains.lesson7.observer;

public class Master extends Employee {
    private String name;
    private String surName;
    private int salary = 80000;

    public Master(String surName, String name) {
        super(surName, name);
        this.surName = surName;
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, JobType jobType, int salary) {
        System.out.println("Мастер реагирует");
        switch (jobType) {
            case Middle:
                if (this.salary <= salary) {
                    System.out.printf("Специалист %s %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Специалист %s %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                }
                break;
            case Senior:
                if (this.salary <= salary) {
                    System.out.printf("Специалист %s %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Специалист %s %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                }
                break;
            case TeamLead:
                if (this.salary <= salary) {
                    System.out.printf("Специалист %s %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Специалист %s %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                }
                break;
            default:
                break;
        }

    }

}
