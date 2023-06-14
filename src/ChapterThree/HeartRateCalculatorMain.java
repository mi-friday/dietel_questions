package ChapterThree;

import java.time.LocalDate;
import java.time.Period;

public class HeartRateCalculatorMain {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public HeartRateCalculatorMain(String firstName, String lastName, int birthYear, int birthMonth, int birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        Period age = Period.between(birthDate, currentDate);
        return age.getYears();
    }

    public int calculateMaximumHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }

    public String calculateTargetHeartRateRange() {
        int maximumHeartRate = calculateMaximumHeartRate();
        int lowerRange = (int) (maximumHeartRate * 0.5);
        int upperRange = (int) (maximumHeartRate * 0.85);
        return lowerRange + " - " + upperRange;
    }

    public static void main(String[] args) {
        HeartRateCalculatorMain person = new HeartRateCalculatorMain("Michael", "Friday", 1997, 7, 5);

        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.calculateAge());
        System.out.println("Maximum Heart Rate: " + person.calculateMaximumHeartRate());
        System.out.println("Target Heart Rate Range: " + person.calculateTargetHeartRateRange());
    }
}
