package week7;

public class Manager extends Employee {


    public Manager(int id, String name, double salary, String department) {
        (id, name, salary, department);

    }

    public void printNameDirectly() {
        System.out.println("Direct access to name: " + name);
    }
        public static void main(String[] args) {

            Manager bob = new Manager(1, "Bob", 50000, "IT");
            bob.printNameDirectly();
        }
        
    }

