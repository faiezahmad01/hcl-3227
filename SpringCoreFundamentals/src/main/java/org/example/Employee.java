package org.example;

import org.example.constructordi.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Autowired
    Address a;
    public void setFlatNo(int num){
        a.setFlatNo(num);
    }
    public void displayAddress(){
        System.out.println(a.getFlatNo());
    }


}
