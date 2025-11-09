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
}
