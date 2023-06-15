import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 600;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to get first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // call a method for asking department - return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        // combine sections to generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your email is: " + this.email);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);
    }

    // Determine the department
    private String setDepartment(){
        System.out.print("New worker: " + firstName + " " + lastName +
                "\n\nDepartment Numbers: \n 1 for Administrative\n 2 for Sales\n " +
                "3 for Development\n 4 for Accounting\n 0 for none\nEnter the department number: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){ return "administration"; }
        else if(departmentChoice == 2){ return "sales";}
        else if(departmentChoice == 3){ return "development";}
        else if(departmentChoice == 4){ return "accounting";}
        else {return "";}
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int random=(int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){ return mailboxCapacity; }
    public String getAlternateEmail(){ return alternateEmail; }
    public String getPassword(){ return password; }

    // Display the name, email and mailbox capacity
    public String displayInfo(){
        return  "\nDISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nPASSWORD: " + password +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }


}
