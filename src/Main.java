import Vehicles.Staff;
import Vehicles.Student;
import Vehicles.University;
import Vehicles.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        HashMap<String, Vehicle> h= new HashMap<>();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));


        while(true){

            System.out.println("Enter 1 to add University vehicle, 2 to add Student vehicle, " +
                    " 3 to add Staff vehicle, 4 to update registration no, 5 to print vehicles info, 6 to exit");
            int type = s.nextInt();

            if(type == 6) break;
            switch (type){
                case 1:
                    Vehicle university = addUniversityVehicle(stdIn);
                    System.out.println("Successfully added vehicle");
                    h.put(university.getRegistration_number(), university);
                    break;
                case 2:
                    Vehicle student = addStudentVehicle(stdIn);
                    System.out.println("Successfully added vehicle");
                    h.put(student.getRegistration_number(), student);
                    break;
                case 3:
                    Vehicle staff = addStaffVehicle(stdIn);
                    System.out.println("Successfully added vehicle");
                    h.put(staff.getRegistration_number(), staff);
                    break;
                case 4:
                    if(updateVehicleRegistrationNo(h, stdIn)){
                        System.out.println("Registration number updated successfully");}
                    break;
                case 5:
                    //System.out.println("Enter N to print n vehicles information");
                    //int n = s.nextInt();
                    printTopVehicleInfo(h);
                    break;
            }
        }

        System.out.println(h);
    }

    public static Vehicle addUniversityVehicle(BufferedReader stdIn) throws IOException {

        String input[] = {"registration_number", "purchase_date", "assigned_driver", "department"};
        String output[] = new String[input.length];

        for(int i=0; i<input.length; i++){
            System.out.println("Enter University vehicle's " + input[i]);
            output[i] = stdIn.readLine();
        }

        Vehicle university = new University(output[0], output[1], output[2], output[3]);

        return university;
    }

    public static Vehicle addStudentVehicle(BufferedReader stdIn) throws IOException {

        String input[] = {"vehicle_registration_number", "registration_number", "owner_firstname", "owner_lastname",
                "department", "program"};
        String output[] = new String[input.length];

        for(int i=0; i<input.length; i++){
            System.out.println("Enter Student's " + input[i]);
            output[i] = stdIn.readLine();
        }

        Vehicle student = new Student(output[0], output[1], output[2], output[3], output[4], output[5]);

        return student;
    }

    public static Vehicle addStaffVehicle(BufferedReader stdIn) throws IOException {

        String input[] = {"vehicle_registration_number", "staff_number", "firstname", "lastname", "department"};
        String output[] = new String[input.length];

        for(int i=0; i<input.length; i++){
            System.out.println("Enter Staff's " + input[i]);
            output[i] = stdIn.readLine();
        }

        Vehicle staff = new Staff(output[0], output[1], output[2], output[3], output[4]);

        return staff;
    }

    public static Boolean updateVehicleRegistrationNo(HashMap<String, Vehicle> h, BufferedReader stdIn) throws IOException {

        System.out.println("Enter old Registration number of the vehicle");
        String oldNo =  stdIn.readLine();

        System.out.println("Enter new Registration number of the vehicle");
        String newNo =  stdIn.readLine();

        if(h.containsKey(oldNo)){
            Vehicle vehicle = (Vehicle) h.get(oldNo);
            vehicle.setRegistration_number(newNo);
            h.put(newNo, vehicle);
            h.remove(oldNo);
        }
        else {
            System.out.println("Given Old registration numbered vehicle not found");
            return false;
        }

        return true;
    }


    public static void printTopVehicleInfo(HashMap<String, Vehicle> h){

        for(String veh:h.keySet()){
            Vehicle vehicle = h.get(veh);
            if(vehicle instanceof University){

                System.out.println("\n University vehicle");
                System.out.println("registration_number = " + vehicle.getRegistration_number() + "\n" +
                        "purchase_date = " + ((University) vehicle).getPurchase_date() + "\n" +
                        "assigned_driver = " + ((University) vehicle).getAssigned_driver() + "\n" +
                        "department = " + ((University) vehicle).getDepartment());
            }
            else if(vehicle instanceof Student){

                System.out.println("\n Student vehicle");
                System.out.println("vehicle_registration_number = " + vehicle.getRegistration_number() + "\n" +
                        "registration_number = " + ((Student) vehicle).getStudent_registration_number() + "\n" +
                        "owner_firstname = " + ((Student) vehicle).getOwner_firstname() + "\n" +
                        "owner_lastname = " + ((Student) vehicle).getOwner_lastname() + "\n" +
                        "department = " + vehicle.getDepartment() + "\n" +
                        "program = " + ((Student) vehicle).getProgram());

            }
            else if(vehicle instanceof Staff){

                System.out.println("\n Staff vehicle");
                System.out.println("vehicle_registration_number = " + vehicle.getRegistration_number() + "\n" +
                        "staff_number = " + ((Staff) vehicle).getStaff_number() + "\n" +
                        "firstname = " + ((Staff) vehicle).getFirstname() + "\n" +
                        "lastname = " + ((Staff) vehicle).getLastname() + "\n" +
                        "department = " + vehicle.getDepartment());
            }
        }
    }
}