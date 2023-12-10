package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class EmployeeFabric {
    private static final Object Worker = null;
    private static final Object Master = null;
    private static final Object Student = null;
    private static Random random = new Random();

    private static int randomWorker() {
        return random.nextInt(3);
    }

    public static Employee generateWorker() {
        String[] names = new String[] { "Андрей", "Анатолий", "Василий", "Кирилл", "Владислав", "Олег", "Сергей",
                "Игнат", "Павел", "Антон" };
        String[] surNames = new String[] { "Иванов", "Петров", "Сидоров", "Аверков", "Марков", "Герцен", "Замятин",
                "Цыпляков", "Кулеш", "Орлов" };

        return switch (EmployeeType.values()[randomWorker()]) {
            case Worker ->
                new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)]);
            case Master ->
                new Master(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)]);
            case Student ->
                new Student(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)]);
            default -> throw new IllegalArgumentException("Unexpected value: " + EmployeeType.values()[randomWorker()]);

        };

    }

    public static Employee[] generateEmployees(int count) {
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateWorker();
        }
        return workers;
    }
}
