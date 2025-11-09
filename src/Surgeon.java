/**
 * Represents a Surgeon, a specific type of HealthProfessional.
 * A Surgeon has a specific specialty and is associated with a hospital.
 */
public class Surgeon extends HealthProfessional {
    /**
     * The hospital where the surgeon operates.
     */
    private String hospital;

    /**
     * The specific field of surgery, e.g., "Cardiac Surgery", "Neurosurgery".
     */
    private String specialty;

    /**
     * Default constructor.
     */
    public Surgeon() {
        super();
    }

    /**
     * Parameterized constructor to create a Surgeon with all details.
     * @param id The professional's ID.
     * @param name The professional's name.
     * @param gender The professional's gender.
     * @param hospital The hospital they are affiliated with.
     * @param specialty Their surgical specialty.
     */
    public Surgeon(int id, String name, String gender, String hospital, String specialty) {
        super(id, name, gender);
        this.hospital = hospital;
        this.specialty = specialty;
    }

    /**
     * Overrides the parent's printDetails method to include surgeon-specific information.
     */
    @Override
    public void printDetails() {
        System.out.println("--- Health Professional Type: Surgeon ---");
        super.printDetails();
        System.out.println("Hospital: " + this.hospital);
        System.out.println("Specialty: " + this.specialty);
    }
}
