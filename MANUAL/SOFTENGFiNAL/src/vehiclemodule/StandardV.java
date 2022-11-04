/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclemodule;

/**
 *
 * @author nathanwinslow
 */
public class StandardV {
    String standardID;
    String make;
    String model;
    String engineSize;
    String fuelType;
    String vehicleID;

    public StandardV(String standardID, String make, String model, String engineSize, String fuelType, String vehicleID) {
        this.standardID = standardID;
        this.make = make;
        this.model = model;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.vehicleID = vehicleID;
    }

    StandardV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


    public String getStandardID() {
        return standardID;
    }

    public void setStandardID(String standardID) {
        this.standardID = standardID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
           
}
