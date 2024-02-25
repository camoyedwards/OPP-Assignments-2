package Payrollmanagement;

// Manager class
public class Management extends StaffMember {
    private double bonus;

    // Constructor
    public Management(String firstname, String lastname, String deptNumber, double hoursWorked, double bonus) {
        super(firstname, lastname, deptNumber, hoursWorked);
        this.bonus = bonus;
    }

    public Management(java.lang.String firstname, java.lang.String lastname, java.lang.String deptNumber, double hoursWorked) {
        super(firstname, lastname, deptNumber, hoursWorked);
    }


    // Getter and Setter for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }
}


