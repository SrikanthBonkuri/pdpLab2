import static org.junit.jupiter.api.Assertions.*;

import Vehicles.Staff;
import Vehicles.Student;
import Vehicles.University;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class MainTest
{
    private Main vehicleTest;

    @BeforeEach
    public void setup()
    {
        vehicleTest = new Main();
    }

    @Test
    void test()
    {
        // Each class's tests -> Single functions.
        University uniVehicle1 = new University("K49", "05/27/1998", "Alpha", "CS");
        assertEquals(uniVehicle1.getAssigned_driver(), "Alpha");
        assertEquals(uniVehicle1.getPurchase_date(), "05/27/1998");
        assertEquals(uniVehicle1.getDepartment(), "CS");

        Student studentVehicle1 = new Student("S59", "27", "Sri", "B", "DS", "ML");
        assertNotEquals(studentVehicle1.getOwner_lastname(), "D");
        assertEquals(studentVehicle1.getProgram(), "ML");
        assertEquals(studentVehicle1.getRegistration_number(), "S59");
        assertEquals(studentVehicle1.getStudent_registration_number(), "27");

        Staff staffVehicle1 = new Staff("M45", "30", "Vermont", "Tell", "Chemistry");
        assertEquals(staffVehicle1.getRegistration_number(), "M45");
        assertNotEquals(staffVehicle1.getDepartment(), "Physics");
        assertEquals(staffVehicle1.getStaff_number(), "30");

    }
}
