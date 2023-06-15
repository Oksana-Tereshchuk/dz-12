package com.rd.dz;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected Person partner;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public Person getPartner(){
        return partner;
    }
    public void setPartner(Person partner){
        this.partner=partner;
    }
    public abstract boolean isRetired();
}
