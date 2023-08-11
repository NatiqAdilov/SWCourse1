         public class Main {
            public static void main(String[] args) {
                Salary salary = new Salary(500);
                Employee employee = new Employee(145762, "Natiq Adilov", salary);
                System.out.println("Alınan maaw: " + employee.getSalaryAmount() + " Manat");
                double Amount = employee.calculateTax();
                System.out.println("Kesilen vergi: " + Amount + " Manat");
                double remainingSalary = employee.getSalaryAmount() - Amount;
                System.out.println("Qalan maaw: " + remainingSalary + "Manat");
            }
        }
