package ru.geekbrains.lesson7.builder;

public class Program {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("AAA");
        String str = stringBuilder
                .append("BBB")
                .append("CCC")
                .replace(1, 3, "DDD")
                .delete(1, 5)
                .toString();
        System.out.println(str);

        Order order = new OrderBuilder()
                .setProductName("AAAA")
                .setPrice(200)
                .setQnt(2)
                .setSign(true)
                .build();



    }

}
