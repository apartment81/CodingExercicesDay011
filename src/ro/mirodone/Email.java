package ro.mirodone;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int passwordLength = 8;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "xyzcompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call method asking for department > return department
        this.department = setDepartment();
       // System.out.println("Department selected: " + department);

        // Call method that returns a random password
        this.password = randomPassword(passwordLength);
        System.out.println("Your password id: " + this.password);

        // Generate email
        if(department.equalsIgnoreCase("")){
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companySuffix;
        }else {
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your Email address: " + email);
        }

    }

    //Ask for department
    private String setDepartment(){
        System.out.println("Choose code for department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        }else if(depChoice == 2) {
            return "development";
        }else if(depChoice ==3){
            return "accounting";
        }else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword (int length){
        String passwordSet = "ABCDEFGHJIKLMNOPRSTUWXZQ0123456789@#$%";
        char[] password = new char[length];
        for ( int i=0; i<length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String (password);
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String showInfo() {
        return "NAME: " + firstName + " " + lastName +
                "\nEMAIL: " + email +
                "\nMailBox Capacity: " + mailBoxCapacity + "MB";
    }
}
