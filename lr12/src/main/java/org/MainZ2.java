package org.example.Z2;

public class MainZ2 {
    public static void main(String[] args) {
        Tester tester1 = new Tester("John", "Doe", 3);
        tester1.printInfo();
        System.out.println();
        Tester tester2 = new Tester("Jane", "Smith", 5, "Advanced", 2500 );
        tester2.printInfo(true);
        System.out.println();
        boolean showSalary = false;
        tester2.printInfo(showSalary);
        System.out.println();
        String customSurname = "Johnson";
        String customName = "Mark";
        int customExperience = 4;
        tester1.printInfo(customSurname, customName, customExperience);
        System.out.println();
        int experience = 3;
        double salary = 5000.0;
        int bonus = Tester.calculateBonus(experience, salary);
        System.out.println("Bonus: " + bonus);
    }
}
