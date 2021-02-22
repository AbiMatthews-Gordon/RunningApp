package user;

public class User{
    String firstName;
    String lastName;
    int age;
    double bodyFat;
    String emailAddress;

    public User(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.bodyFat = 0.0;
        this.emailAddress = "";
    }
    /**
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param bodyFat
     * @param emailAddress
     */
    public User(String firstName, String lastName, int age, double bodyFat,String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bodyFat = bodyFat;
        this.emailAddress = emailAddress;
    }
    
    /**
     * 
     * @param use
     */
    public User(User use){
        this.firstName = use.firstName;
        this.lastName = use.lastName;
        this.age = use.age;
        this.bodyFat = use.bodyFat;
        this.emailAddress = use.emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBodyFat() {
        return bodyFat;
    }

    public void setBodyFat(double bodyFat) {
        this.bodyFat = bodyFat;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", bodyFat=" + bodyFat + ", emailAddress=" + emailAddress + ", firstName="
                + firstName + ", lastName=" + lastName + "]";
    }

    
    
    
}