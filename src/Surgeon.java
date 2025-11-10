/**
 * Represents a Surgeon, a specific type of HealthProfessional.
 * They work at a hospital, have a specialty, and can perform surgery.
 */
public class Surgeon extends HealthProfessional {
    private String hospital;

    /**
     * Default constructor.
     */
    public Surgeon() {
        super();
    }

    /**
     * Parameterized constructor for Surgeon.
     * It calls the parent constructor, passing the specialty up,
     * and initializes its own hospital attribute.
     * @param id The professional's ID.
     * @param name The professional's name.
     * @param gender The professional's gender.
     * @param hospital The hospital they are affiliated with.
     * @param specialty Their surgical specialty.
     */
    public Surgeon(int id, String name, String gender, String hospital, String specialty) {
        // Call parent constructor, passing the specialty up
        super(id, name, gender, specialty);
        this.hospital = hospital;
    }

    /**
     * Overrides the parent's printDetails method to specify the type
     * and print unique surgeon attributes.
     */
    @Override
    public void printDetails() {
        System.out.println("--- Health Professional Type: Surgeon ---");
        super.printDetails();
        System.out.println("Hospital: " + this.hospital);
    }
}
