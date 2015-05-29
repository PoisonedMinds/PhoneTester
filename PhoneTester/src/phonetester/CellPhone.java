/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonetester;
/**
 * @title PhoneTester
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 29-May-2015 10:28:34 AM
 * @purpose The purpose of this program is to emulate a cell phone
 */
public class CellPhone {
    //set varible as private
  private String carrier, type;
  private double speed, memory;
  private int numApps;
    CellPhone(){
        //constructor with default values
        carrier="Rogers";
        type = "IPhone";
        speed = 1.2;
        memory = 64.0;
        numApps = 10;

    }
    //methods to get and set private varibles
    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carr) {
        carrier=carr;
    }
    public String getType() {
        return type;
    }
    public void setType(String ty) {
        type=ty;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double sp) {
        speed=sp;
    }
    public double getMemory() {
        return memory;
    }
    public void setMemory(double mem) {
        memory=mem;
    }
    public int getNumApps() {
        return numApps;
    }
    public void setNumApps(int apps) {
        numApps=apps;
    }
    //method to output all the info at once.
    public String toString() {
        String output="";
                    output+=("Carrier = " + carrier);
    output+=("\nType of phone = " + type);
    output+=("\nSpeed of phone = " + speed+"Ghz");
    output+=("\nMemory = "+memory+"Gb");
    output+=("\nNumber of Apps = "+numApps);
                
                
                return output;
    }

}