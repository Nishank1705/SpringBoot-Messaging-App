package com.myFirst.api;

public class DtoUser {
    String firstName;
    String lastName;
    public DtoUser(String f,String l){
        firstName=f;
        lastName=l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

}
