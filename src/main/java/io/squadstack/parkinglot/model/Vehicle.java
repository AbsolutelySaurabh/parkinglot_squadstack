package io.squadstack.parkinglot.model;

/**
 * @author AbsolutelySaurabh
 */
public abstract class Vehicle {

    private String registrationNo;
    private int driverAge;

    public Vehicle(String registrationNo, int driverAge) {
        this.registrationNo = registrationNo;
        this.driverAge = driverAge;
    }

    @Override
    public String toString() {
        return "[registrationNo=" + registrationNo + ", driverAge=" + driverAge + "]";
    }

    public String getRegistrationNo() {
        return registrationNo;
    }
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }
    public int getDriverAge() {
        return driverAge;
    }
    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }
}
