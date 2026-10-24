package org.example.constructordi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Address {
    int FlatNo;

    public int getFlatNo() {
        return FlatNo;
    }

    public void setFlatNo(int flatNo) {
        FlatNo = flatNo;
    }
}
