package com.company;

import java.util.ArrayList;

public class Company implements SalaryService {
    private String name;
    private double budget;
    private ArrayList<Employee> employees;
    private String shortName;

    public Company(String name, double budget, ArrayList<Employee> employees) {
        this.name = name;
        this.budget = budget;
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee); }

    public static SalaryService getSalaryService() {

        Manager manager = new Manager(100, 18);
        Developer developer = new Developer(200, 20, 5000);
        ScrumMaster scrumMaster = new ScrumMaster(250, 10);

        Company company = new Company(null, 0.0, new ArrayList<>());
        company.addEmployee(manager);
        company.addEmployee(developer);
        company.addEmployee(scrumMaster);

        return company; }

    @Override
    public void pay(Company company) {
        double sumОfSalary = 0;
        double balance ;

        for (int i = 0; i < employees.size(); i++) {
            sumОfSalary += employees.get(i).getSalary();
        }
        if (company.budget >= sumОfSalary) {
            balance = company.budget - sumОfSalary;
            for (int i = 0; i < employees.size(); i++) {

                System.out.println(employees.get(i).getClass().getSimpleName()+ " " + employees.get(i).getSalary()); }
            System.out.println("Остаток от бюджета компании " + company.name+ " составляет " + balance);
        } else {
            double overBudget = sumОfSalary - company.budget;
            System.out.println("Общая сумма зарплат превышает бюджет компании " + company.name+ " на сумму " + overBudget); } }}
