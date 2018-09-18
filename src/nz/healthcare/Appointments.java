/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.healthcare;

/**
 *
 * @author navjo
 */
public class Appointments {
    private String appointmentID;
    private String nhiNumber;
    private String docID;
    private String appointmentDate;
    private String appointmentTime;
    private String disease;
    private boolean seenByDoctor;
    private String firstName;
    private String middleName;
    private String lastName;
    
    public Appointments(String appointmentID, String nhiNumber, String docID, String appointmentDate,
            String appointmentTime, String disease, boolean seenByDoctor, 
            String firstName, String middleName, String lastName) {
        this.appointmentID = appointmentID;
        this.nhiNumber = nhiNumber;
        this.docID = docID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.disease = disease;
        this.seenByDoctor = seenByDoctor;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    public Appointments() {
        
    }
    
    String getAppointmentID() {
        return this.appointmentID;
    }
    
    String getNhiNumber() {
        return this.nhiNumber;
    }
    
    String getDocID() {
        return this.docID;
    }
    
    String getAppointmentDate() {
        return this.appointmentDate;
    }
    
    String getAppointmentTime() {
        return this.appointmentTime;
    }
    
    String getDisease() {
        return this.disease;
    }
    
    boolean getSeenByDoctor() {
        return this.seenByDoctor;
    }
    
    String getFirstName() {
        return this.firstName;
    }
    
    String getMiddleName() {
        return this.middleName;
    }
    
    String getLastName() {
        return this.lastName;
    }
}
