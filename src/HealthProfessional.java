/**
 * Represents a health professional in the system.
 * This is the base class for all specific types of health professionals.
 */
public class HealthProfessional {
    protected int id;
    protected String name;
    protected String gender;
    protected String specialty;

    /**
     * Default constructor.
     */
    public HealthProfessional() {
    }

    /**
     * Parameterized constructor to initialize all common attributes.
     * @param id The professional's ID.
     * @param name The professional's name.
     * @param gender The professional's gender.
     * @param specialty The professional's specialty or practice area.
     */
    public HealthProfessional(int id, String name, String gender, String specialty) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.specialty = specialty;
    }

    /**
     * Prints the common details of the health professional.
     */
    public void printDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Specialty: " + this.specialty);
    }
}