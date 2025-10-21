package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        double regularPay = this.payRate * this.getRegularHours();

        double overtimePay = (this.payRate * 1.5) * this.getOvertimeHours();

        return regularPay + overtimePay;
    }

    //Will return 40 or less, based on their hours worked
    public double getRegularHours() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    //Will hours worked over 40
    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }
public void punchIn(double time){
        this.punchInTime = LocalTime.now().toSecondOfDay();
    System.out.println(name + " Punch In At " + this.punchInTime + " hours. ");
}
public void punchOut(double time){
    double currentTimeInHours = LocalTime.now().toSecondOfDay();
    double shiftHours = time = this.punchInTime;
    this.hoursWorked += shiftHours;
    System.out.println(name + " punch out at " + currentTimeInHours + " Hours Work This Shift " + shiftHours);
}


}
