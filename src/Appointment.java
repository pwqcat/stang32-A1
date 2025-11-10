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
}
