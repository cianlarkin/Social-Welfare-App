/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WelfareAppFinal;

/**
 *
 * @author x17138744
 */
public class Housing extends Welfare {
    
    //data members declared for Housing class
    private String house;
    private String area;
    private String accomodation;

    //Super constructor added with additional data members added from previous classes

    public Housing(String ppsNo, String fname, String lname, String pAddress, String cAddress, String contactNum, String house, String area, String accomodation) {
        super(ppsNo, fname, lname, pAddress, cAddress, contactNum);
        this.house = house;
        this.area = area;
        this.accomodation = accomodation;
    }
    
    //Setting Constructor default values
    public Housing(){
        super();
        house = "";
        area = "";
        accomodation = "";
    }
       
    //Creation of Getters and Setters
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAccomodation() {
        return accomodation;
    }

    public void setAccomodation(String accomodation) {
        this.accomodation = accomodation;
    }  
    
    //Polymorphism Example
    @Override
    public String getDetails(){
        return super.getDetails() + "1" + lname + "2" + fname + "3" + contactNum;
    }
}
