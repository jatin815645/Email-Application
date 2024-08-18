import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "sko.com";

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email Name : "+this.firstName+" "+this.lastName);

        this.department = setDepartment();
        System.out.println("Department : "+ this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password = "+this.password);

        this.email = this.firstName+ "." + this.lastName+ "@"+ this.department + "." +companySuffix;
        System.out.println("Email : "+this.email);
    }

    private String setDepartment(){
        System.out.print("Department Codes \n1 for Sales\n2 for Development\n3 for Accounts\n0 for none\nEnter your code : ");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();

        if (code == 1) { return "sales"; }
        else if (code == 2) { return "dev"; }
        else if (code == 3) { return "acct"; }
        return "none";
    }

    public String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }
}
