/**
 * Represents a General Practitioner, a specific type of HealthProfessional.
 */
public class GeneralPractitioner extends HealthProfessional {
    private String gpRegistrationNumber;

    /**
     * Default constructor.
     */
    public GeneralPractitioner() {
        super();
    }

    /**
     * Parameterized constructor for GeneralPractitioner.
     * @param id The professional's ID.
     * @param name The professional's name.
     * @param gender The professional's gender.
     * @param gpRegistrationNumber The GP's unique registration number.
     */
    public GeneralPractitioner(int id, String name, String gender, String gpRegistrationNumber) {
        // Call parent constructor, setting specialty to "General Practice"
        super(id, name, gender, "General Practice");
        this.gpRegistrationNumber = gpRegistrationNumber;
    }

    /**
     * Overrides the parent's printDetails method to specify the type
     * and print the unique registration number.
     */
    @Override
    public void printDetails() {
        System.out.println("--- Health Professional Type: General Practitioner ---");
        super.printDetails();
        System.out.println("Registration Number: " + this.gpRegistrationNumber);
    }
}
