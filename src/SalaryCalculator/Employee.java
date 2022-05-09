package SalaryCalculator;

public class Employee {
    String name;
    float  salary;
    float  workHours;
    int    hireYear;

    Employee(String name, float salary, float workHours, int hireYear) {
        this.name      = name;
        this.salary    = salary;
        this.workHours = workHours;
        this.hireYear  = hireYear;
    }

    float tax() {
        if (this.salary > 1000) {
            return (this.salary * 0.03F);
        }
        return 0;
    }

    float bonus() {
        if (workHours > 40) {
            return ((workHours - 40) * 30);
        } else {
            return 0;
        }
    }

    float raiseSalary() {
        int diffYear = 2021 - this.hireYear;

        if (diffYear < 10) {
            return this.salary * 0.05F;
        } else if (diffYear < 20) {
            return this.salary * 0.1F;
        } else {
            return this.salary * 0.15F;
        }
    }

    public String toString() {

        float
                tax = this.tax(),
                bonus = this.bonus(),
                raiseSalary = this.raiseSalary();

        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı  : " + this.salary);
        System.out.println("Çalışma Saati  : " + this.workHours);
        System.out.println("Başlangıç Yılı  : " + this.hireYear);
        System.out.println("Vergi   : " + tax);
        System.out.println("Maaş Artışı   : " + raiseSalary);
        System.out.println("Bonus   : " + bonus);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş   : " + ((this.salary + bonus + raiseSalary) - tax));
        System.out.println("Toplam Maaş   : " + (this.salary + raiseSalary));
        return null;
    }
}
