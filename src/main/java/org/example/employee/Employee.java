package org.example.employee;

import java.util.Date;

public class Employee {
    private Date hireDay;


    public void setHireDay(int day, int month, int year){
        this.hireDay = new Date(year + "/" + month + "/" + day);
    }
    public Date getHireDay(){
        return (Date) this.hireDay.clone();
    }
}


