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
public class Pension extends Housing {
    
   //Data members declared for Pension class.
    private String prevemploy;
    private String socialbenefits;
    private String penDisability;

    //Super Constructor added with previous class atrributes.

    public Pension(String ppsNo, String fname, String lname, String pAddress, String cAddress, String contactNum, String house, String area, String accomodation, String prevemploy, String socialbenefits, String penDisability) {
        super(ppsNo, fname, lname, pAddress, cAddress, contactNum, house, area, accomodation);
        this.prevemploy = prevemploy;
        this.socialbenefits = socialbenefits;
        this.penDisability = penDisability;
    }
    
    
    
    //Constructor defaults sets on Pension class
    public Pension() {
        super();
        prevemploy = "";
        socialbenefits = "";
        penDisability = "";
    }

    //Setters and Getters added.

    public String getPrevemploy() {
        return prevemploy;
    }

    public void setPrevemploy(String prevemploy) {
        this.prevemploy = prevemploy;
    }

    public String getSocialbenefits() {
        return socialbenefits;
    }

    public void setSocialbenefits(String socialbenefits) {
        this.socialbenefits = socialbenefits;
    }

    public String getPenDisability() {
        return penDisability;
    }

    public void setPenDisability(String penDisability) {
        this.penDisability = penDisability;
    }
    
}
