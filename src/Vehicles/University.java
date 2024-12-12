package Vehicles;

public class University extends Vehicle{

    String registration_number;
    String purchase_date;
    String assigned_driver;
    String department;

    public University(String registration_number, String purchase_date, String assigned_driver, String department){
        this.registration_number = registration_number;
        this.purchase_date = purchase_date;
        this.assigned_driver = assigned_driver;
        this.department = department;
    }

    public void setRegistration_number(String registration_number){
        this.registration_number = registration_number;
    }

    public void setPurchase_date(String purchase_date){
        this.purchase_date = purchase_date;
    }

    public void setAssigned_driver(String assigned_driver){
        this.assigned_driver = assigned_driver;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getRegistration_number(){
        return this.registration_number;
    }

    public String getPurchase_date(){
        return this.purchase_date;
    }

    public String getAssigned_driver(){
        return this.assigned_driver;
    }

    public String getDepartment(){
        return this.department;
    }

}
