/**
 * Represents an appointment in the health service system.
 * It holds details about the patient, the selected doctor, and the time slot.
 */
public class Appointment {
    /**
     * The name of the patient who made the appointment.
     */
    private String patientName;

    /**
     * The mobile phone number of the patient.
     */
    private String patientMobile;

    /**
     * The preferred time slot for the appointment, e.g., "09:00", "14:30".
     */
    private String timeSlot;

    /**
     * The doctor selected for the appointment.
     * Using the parent class type HealthProfessional allows for polymorphism,
     * meaning this can hold any object of a subclass (e.g., GeneralPractitioner, Surgeon).
     */
    private HealthProfessional doctor;

    /**
     * Default constructor.
     * Creates an empty Appointment object.
     */
    public Appointment() {
    }

    /**
     * Parameterized constructor to create an Appointment with all details.
     * @param patientName The name of the patient.
     * @param patientMobile The mobile number of the patient.
     * @param timeSlot The selected time slot.
     * @param doctor The selected health professional.
     */
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    /**
     * Prints all details of the appointment, including patient and doctor information.
     */
    public void printDetails() {
        System.out.println("--- Appointment Details ---");
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Patient Mobile: " + this.patientMobile);
        System.out.println("Time Slot: " + this.timeSlot);
        System.out.println("Doctor Details:");
        doctor.printDetails();
    }

    /**
     * Gets the mobile number of the patient for this appointment.
     * @return the patient's mobile number
     */
    public String getPatientMobile() {
        return this.patientMobile;
    }
}
