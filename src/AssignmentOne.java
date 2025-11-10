import java.util.ArrayList;

public class AssignmentOne {
    // The list is moved here and marked as static to be shared across all static methods
    static ArrayList<Appointment> appointmentList = new ArrayList<>();

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

        // Part 5 - Collection of appointments
        System.out.println("\nCreating appointments...");
        // Now we call the new method to create appointments
        createAppointment("San Zhang", "100001", "10:00", gp1);
        createAppointment("Si Li", "100002", "11:00", gp2);
        createAppointment("Wu Wang", "100003", "10:30", s1);
        createAppointment("Liu Zhao", "100004", "11:30", s2);
        System.out.println();

        // Now we call the new method to print appointments
        printExistingAppointments();

        // Cancel an appointment
        cancelBooking("100002");

        // Print the list again to see the changes
        printExistingAppointments();
    }

    /**
     * Creates a new Appointment object and adds it to the static appointmentList.
     * @param patientName The name of the patient.
     * @param patientMobile The mobile number of the patient.
     * @param timeSlot The desired time slot.
     * @param doctor The selected health professional.
     */
    public static void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        Appointment newAppt = new Appointment(patientName, patientMobile, timeSlot, doctor);
        appointmentList.add(newAppt);
        System.out.println("A new appointment has been created.");
    }

    /**
     * Prints the details of all appointments currently in the list.
     * If the list is empty, it prints a corresponding message.
     */
    public static void printExistingAppointments() {
        System.out.println("--- Printing All Appointments ---");
        if (appointmentList.isEmpty()) {
            System.out.println("There are no appointments.");
        } else {
            for (Appointment appt : appointmentList) {
                appt.printDetails();
                System.out.println();
            }
        }
    }

    /**
     * Cancels an appointment by finding it using the patient's mobile number.
     * @param mobileNumber The mobile number of the patient whose appointment is to be cancelled.
     */
    public static void cancelBooking(String mobileNumber) {
        Appointment appointmentToCancel = null;
        for (Appointment appt : appointmentList) {
            if (appt.getPatientMobile().equals(mobileNumber)) {
                appointmentToCancel = appt;
                break;
            }
        }

        if (appointmentToCancel != null) {
            appointmentList.remove(appointmentToCancel);
            System.out.println("\nAppointment for mobile number " + mobileNumber + " has been cancelled.");
        } else {
            System.out.println("\nError: No appointment found for mobile number " + mobileNumber);
        }
    }
}
