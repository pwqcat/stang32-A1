public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 - Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Ming", "Male", "General Practice");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Hong", "Female", "General Practice");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Gang", "Male", "General Practice");

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
