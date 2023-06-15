package com.rd.dz;

public class Man extends Person{
    public Man (String FirstName,String LastName){
        this.firstName=FirstName;
        this.lastName=LastName;
    }
    public Man (String FirstName,String LastName,int Age,Woman Partner){
        this.firstName=FirstName;
        this.lastName=LastName;
        this.age=Age;
        this.partner=Partner;
    }

    @Override
    public boolean isRetired() {
        if (this.age>65)
        return true;
        else
            return false;
    }
}
