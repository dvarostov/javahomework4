package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        //int percent = 150;
        //long bonus = service.calculate(5000, true);
        //System.out.printf(percent + "== ? ==" + bonus);

        //int amount = 1000;
        //boolean registered = true;
        //int expected = 30;

        //int actual = service.calculate(1000, true);
        //Assertion.assertEquals(expected, actual);


        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        // вызываем целевой метод:
        long actual = service.calculate(amount , registered );

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}


