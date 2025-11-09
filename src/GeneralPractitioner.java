/**
 * Represents a General Practitioner, a specific type of HealthProfessional.
 * This class inherits common attributes from HealthProfessional and adds its own specific details.
 */
public class GeneralPractitioner extends HealthProfessional {
    /**
     * The specific practice area of the General Practitioner, e.g., "General Practice".
     * This attribute differentiates the GP from other specialists.
     */
    private String practiceArea;

    /**
     * Default constructor.
     * Creates an empty GeneralPractitioner object, implicitly calling the parent's default constructor.
     */
    public GeneralPractitioner() {
        super();
    }

    /**
     * Parameterized constructor.
     * Creates a GeneralPractitioner object with all attributes initialized.
     * @param id The professional's ID.
     * @param name The professional's name.
     * @param gender The professional's gender.
     * @param practiceArea The GP's specific practice area.
     */
    public GeneralPractitioner(int id, String name, String gender, String practiceArea) {
        super(id, name, gender);
        this.practiceArea = practiceArea;
    }

    /**
     * Overrides the parent's printDetails method to include information specific to a General Practitioner.
     * It first calls the parent's method to print common details, then adds its own specific details.
     */
    @Override
    public void printDetails() {
        System.out.println("--- Health Professional Type: General Practitioner ---");
        super.printDetails();
        System.out.println("Practice Area: " + this.practiceArea);
    }
}
