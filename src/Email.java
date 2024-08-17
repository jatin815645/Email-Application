import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email Name : "+this.firstName+" "+this.lastName);

        this.department = setDepartment();
        System.out.println("Department : "+ this.department);
    }

    private String setDepartment(){
        System.out.print("Department Codes \n1 for Sales\n2 for Development\n3 for Accounts\n0 for none\nEnter your code : ");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();

        if (code == 1){ return "sales"; }
        else if (code == 2) { return "dev"; }
        else if (code == 3) { return "acct"; }
        return "none";
    }
}
