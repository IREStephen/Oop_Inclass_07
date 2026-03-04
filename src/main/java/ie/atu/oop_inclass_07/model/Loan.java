package ie.atu.oop_inclass_07.model;
import io.swagger.v3.oas.annotations.media.schema;
import jakarta.validation.constraints.*;

public class Loan {
@Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private long id;
@NotBlank(message = "Loan must be specified") private String loanTag;
@Email(message = "Student Email needs to be valid")  private String studentEmail;
@NotBlank(message = "Date must be entered for a loan") private String loanDate;

private int startHour;
@Positive(message "Invalid duration time")
@Min(value = 1, message "minimum duration is 1 hour")
@Max(value = 24, message "maximum duarion is 24 hours")
    private int durationHours;
public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getLoanTag() { return loanTag; }
    public void setLoanTag(String loanTag) { this.loanTag = loanTag; }
    public String getStudentEmail() { return studentEmail; }
    public void setStudentEmail(String studentEmail) { this.studentEmail = studentEmail; }
    public int getStartHour() { return startHour; }
    public void setStartHour(int startHour) { this.startHour = startHour; }
    public int getDurationHours() { return durationHours; }
    public void setDurationHours(int durationHours) { this.durationHours = durationHours; }

}
