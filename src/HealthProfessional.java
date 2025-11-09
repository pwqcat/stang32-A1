public class HealthProfessional {
    protected int id;
    protected String name;
    protected String gender;

    /**
     * Default constructor.
     * Creates a HealthProfessional object with default empty values.
     */
    public HealthProfessional() {
    }

    /**
     * Parameterized constructor.
     * Creates a HealthProfessional object with specified initial values.
     * @param id The professional's ID.
     * @param name The professional's name.
     * @param gender The professional's gender.
     */
    public HealthProfessional(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    /**
     * Prints the details of the health professional to the console.
     */
    public void printDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
    }
}