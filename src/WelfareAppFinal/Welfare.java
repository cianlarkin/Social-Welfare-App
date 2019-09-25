/*
 This program was produced and created by three members
    Matthew Byrne
    Cian Larkin 
    Carl Flynn
 */
package WelfareAppFinal;

import java.io.Serializable;

/**
 *
 * @author x17138744
 */
public class Welfare implements Serializable {
    
    //Data members
    protected String ppsNo;
    protected String fname;
    protected String lname;
    protected String pAddress;
    protected String cAddress;
    protected String contactNum;
    
    // No Arg Constructor
    public Welfare(){
        ppsNo = " ";
        fname = " ";
        lname = " ";
        pAddress = " ";
        cAddress = " ";
        contactNum = " ";       
    }
    
    //Overloaded Constructor
    public Welfare(String ppsNo, String fname, String lname, String pAddress, String cAddress, String contactNum) {
        this.ppsNo = ppsNo;
        this.fname = fname;
        this.lname = lname;
        this.pAddress = pAddress;
        this.cAddress = cAddress;
        this.contactNum = contactNum;
    }

    public String getPpsNo() {
        return ppsNo;
    }

    public void setPpsNo(String ppsNo) {
        this.ppsNo = ppsNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    
    //Polymorphism Example
    public String getDetails(){
        return getDetails() + "1" + lname + "2" + fname + "3" + contactNum;
    }
}
