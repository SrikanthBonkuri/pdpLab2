package Vehicles;

public class Staff extends Vehicle{

    String registration_number;
    String staff_number;
    String firstname;
    String lastname;
    String department;

    public Staff(String registration_number, String staff_number, String firstname, String lastname, String department){
        this.registration_number = registration_number;
        this.staff_number = staff_number;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
    }


    public void setRegistration_number(String registration_number){
        this.registration_number = registration_number;
    }

    public String getRegistration_number(){
        return this.registration_number;
    }

    public String getStaff_number(){
        return this.staff_number;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getDepartment(){
        return this.department;
    }
}