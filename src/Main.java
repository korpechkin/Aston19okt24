//import java.util.Arrays;
//import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Employee[] employees = new Employee[5];

            employees[0] = new Employee("Elcin Boris", "President", "elcin@mail.com", "1111111", 100000, 77 );
            employees[1] = new Employee("Poroshenko Petr", "Director", "petr@mail.com", "2222222", 2000000, 60);
            employees[2] = new Employee("Gorbachev Mihail", "First President", "gorbachev@mail.com",  "3333333", 3000000, 90);
            employees[3] = new Employee("Merkel Angela", "Kancler", "angela@mail.com", "44444444", 400000, 55);
            employees[4] = new Employee("Lebedev Artemii", "Designer", "tema@mail.com", "99999999",1000000, 49);


            for (Employee employee : employees) {
                employee.printInfo();
            }
        }
    }

