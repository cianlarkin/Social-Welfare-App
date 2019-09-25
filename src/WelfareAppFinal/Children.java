/*
 This program was produced and created by three members
    Matthew Byrne
    Cian Larkin 
    Carl Flynn
 */
package WelfareAppFinal;

/**
 *
 * @author x17138744
 */
public class Children extends Pension {
    
    //Data members declared and added for Children
    private String childName;
    private String orphan;
    private String disability;
    private String childAddress;

    //Super Constructor with a sub class of a sub class.

    public Children(String ppsNo, String fname, String lname, String pAddress, String cAddress, String contactNum, String house, String area, String accomodation, String prevemploy, String socialbenefits, String penDisability, String childName, String orphan, String disability, String childAddress) {
        super(ppsNo, fname, lname, pAddress, cAddress, contactNum, house, area, accomodation, prevemploy, socialbenefits, penDisability);
        this.childName = childName;
        this.orphan = orphan;
        this.disability = disability;
        this.childAddress = childAddress;
    }

    //Default constructor set for Children variables.
    public Children() {
        super();
        childName = "";
        orphan = "";
        disability = "";
        childAddress = "";
    }

    //Setters and Getters set for Children class.

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getOrphan() {
        return orphan;
    }

    public void setOrphan(String orphan) {
        this.orphan = orphan;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getChildAddress() {
        return childAddress;
    }

    public void setChildAddress(String childAddress) {
        this.childAddress = childAddress;
    }
    
}
