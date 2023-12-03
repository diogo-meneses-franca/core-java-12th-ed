package org.example.employee;

import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        var empregado = new Employee();
        empregado.setHireDay(26,05,1986);
        System.out.println(empregado.getHireDay());

        Date d = empregado.getHireDay();
        double tenYearsInMiliseconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
        d.setTime(d.getTime() + (long) tenYearsInMiliseconds);

        System.out.println(empregado.getHireDay());
        System.out.println(d.getTime());
    }
}
