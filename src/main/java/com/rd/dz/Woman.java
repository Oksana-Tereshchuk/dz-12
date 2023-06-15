package com.rd.dz;

public class Woman extends Person{
    public Woman (String FirstName,String LastName){
        this.firstName=FirstName;
        this.lastName=LastName;
        this.registerPartnership=true;
    }
    private boolean registerPartnership;
    public Woman (String FirstName, String LastName, int Age, Man Partner){
        this.firstName=FirstName;
        this.lastName=LastName;
        this.age=Age;
        this.partner=Partner;
        this.registerPartnership=true;
    }
    @Override
    public boolean isRetired() {
        if (this.age>60)
            return true;
        else
            return false;
    }
    @Override
    public String getLastName() {
        if (this.registerPartnership==true)
            return this.partner.getLastName();
        else
            return this.lastName;
    }

    public void deregisterPartnership(boolean Divorced) {
        this.registerPartnership=Divorced;
    }
}
