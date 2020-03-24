package com.company;

public class Developer extends Employee {
    private double bonuses;

    public Developer(double ratePerHour, int workdays, double bonuses) {
        super(ratePerHour, workdays);
        this.bonuses = bonuses; }

        @Override
    public double getSalary() {
        return super.getSalary() + bonuses; }}
