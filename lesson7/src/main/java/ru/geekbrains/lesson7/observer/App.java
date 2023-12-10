package ru.geekbrains.lesson7.observer;

public class App {
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Gxxgle", publisher, 50000);
        Company yandex = new Company("Yandex", publisher, 850000);
        Company apple = new Company("Apple", publisher, 300000);
        Company newSoft = new Company("NewSoft", publisher, 20000);
        Company oldSoft = new Company("OldSoft", publisher, 300000);
        Company softLine = new Company("SoftLine", publisher, 5000);

        // Student student1 = new Student("Студент №1");
        // Student student2 = new Student("Студент №2");
        // Student student3 = new Student("Студент №3");

        // Master master = new Master("Мастер №1");
        // Master master1 = new Master("Мастер №2");
        // Master master2 = new Master("Мастер №3");

        // Worker worker = new Worker("Рабочий №1");
        // Worker worker2 = new Worker("Рабочий №2");
        // Worker worker3 = new Worker("Рабочий №3");

        // publisher.registerObserver(master);
        // publisher.registerObserver(master1);
        // publisher.registerObserver(master2);
        // publisher.registerObserver(student1);
        // publisher.registerObserver(student2);
        // publisher.registerObserver(student3);
        // publisher.registerObserver(worker3);
        // publisher.registerObserver(worker2);
        // publisher.registerObserver(worker);

        Employee[] employees = EmployeeFabric.generateEmployees(5);
        for (Employee e : employees) {

            publisher.registerObserver(e);

           // System.out.println(e.getClass().getName() + " " + e.name + " " + e.surName);
        }

        for (int i = 0; i < 3; i++) {
            google.needEmployee(EmployeeType.Student, JobType.Junior);
            yandex.needEmployee(EmployeeType.Worker, JobType.Cleaner);
            apple.needEmployee(EmployeeType.Master, JobType.TeamLead);
            newSoft.needEmployee(EmployeeType.Worker, JobType.Security);
            oldSoft.needEmployee(EmployeeType.Master, JobType.Senior);
            softLine.needEmployee(EmployeeType.Student, JobType.Intern);
        }

        // System.out.println(worker.getClass().getTypeName());

    }
}