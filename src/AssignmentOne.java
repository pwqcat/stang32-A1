public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 - Using classes and objects
        // GP's constructor now requires a registration number, we use the "GP" + ID format
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Ming", "Male", "GP101");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Hong", "Female", "GP102");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Gang", "Male", "GP103");

        // Surgeon's constructor signature has not changed, so this part of the code requires no modification
        Surgeon s1 = new Surgeon(4, "Dr. Li", "Female", "No.4 Hospital", "Neurosurgery");
        Surgeon s2 = new Surgeon(5, "Dr. Mei", "Female", "No.1 Hospital", "CardioSurgery");

        System.out.println(); // for readability
        System.out.println("--- Printing All Professionals Details ---");
        gp1.printDetails();
        System.out.println(); // for separation
        gp2.printDetails();
        System.out.println();
        gp3.printDetails();
        System.out.println();
        s1.printDetails();
        System.out.println();
        s2.printDetails();

        // Add the required separator
        System.out.println("--------------------");
    }
}
