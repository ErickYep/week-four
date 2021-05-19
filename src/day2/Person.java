package day2;

public class Person {
    private String firstName;
    private String lastName;
    private String passportID;
    private int age;
    private String gender;
    private String nationality;

    Person() {
        firstName = "Erick";
        lastName = "Yepremyan";
        passportID = "passport ID";
        age = 21;
        gender = "Male";
        nationality = "Armenian";
    }

    Person(String firstName, String lastName, String passportID, int age,
           String gender, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        if (firstName.length() > 3 && firstName.length() < 15)
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 6 && lastName.length() < 20)
            this.lastName = lastName;

    }

    public String getPassportID() {
        return passportID;
    }

    private boolean checkPassportId(String passportId) {
        boolean result = true;
        if (passportId.length() != 8) {
            return false;
        } else if (passportId.charAt(0) != 'A' && passportId.charAt(1) != 'N') {
            return false;
        }
        for (int i = 2; i < passportId.length(); i++) {
            if (passportId.charAt(i) > '9' || passportId.charAt(i) < '0'){
                result = false;
                break;
            }
        }
        return result;
    }

    public void setPassportId(String passportID) {
        if(checkPassportId(passportID))
           this.passportID = passportID;
        else
            System.out.println("Invalid passport ID");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 99)
            this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("male") || gender.equals("female"))
            this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String display() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportID='" + passportID + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }


}
