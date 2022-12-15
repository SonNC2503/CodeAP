
package asmAp;
public class FlightAttendant extends Employee {
    private String salary;

    public FlightAttendant(String id, String name, String dob, String gender,
            String address, int phone, String salary) 
    {
        super(id, name, dob, gender, address, phone);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}


