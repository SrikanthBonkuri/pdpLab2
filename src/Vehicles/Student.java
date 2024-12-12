package Vehicles;

public class Student extends Vehicle{


    String registration_number;
    String student_registration_number;
    String owner_firstname;
    String owner_lastname;
    String department;
    String program;


    public Student(String registration_number, String student_registration_number, String owner_firstname, String owner_lastname,
                   String department, String program){

        this.registration_number = registration_number;
        this.student_registration_number = student_registration_number;
        this.owner_firstname = owner_firstname;
        this.owner_lastname = owner_lastname;
        this.department = department;
        this.program = program;
    }

    public void setRegistration_number(String registration_number){
        this.registration_number = registration_number;
    }

    public String getRegistration_number(){
        return this.registration_number;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getStudent_registration_number(){
        return this.student_registration_number;
    }

    public String getOwner_firstname(){
        return this.owner_firstname;
    }

    public String getOwner_lastname(){
        return this.owner_lastname;
    }

    public String getProgram(){
        return this.program;
    }
}
