package lesson5;

import java.sql.SQLOutput;

public class ListStaff {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Sinigalski", "Manager", "plitka@hust.as", "+7-598-743-21-23", 40000, 32);
        employees[1] = new Employee("Denni Carter", "Killer", "Knith@hust.as", "+7-987-432-77-77", 500000, 41);
        employees[2] = new Employee("Jimmy Bond", "Security", "Save@hust.as", "+7-987-221-56-78", 120000, 28);
        employees[3] = new Employee("Anna Prime", "Secretary", "sexbool@hust.as", "+7-987-666-63-52", 100000, 27);
        employees[4] = new Employee("Violetta Ester", "Insurer", "tuheir@hust.as", "+7-987-520-78-98", 80000, 45);

        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40) employees[i].print();
    }


}

/*for (int i = 0; i < employees.length; i++) {
        employees[i].print();
        }*/