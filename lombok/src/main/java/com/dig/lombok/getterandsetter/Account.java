package com.dig.lombok.getterandsetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {

    private String accountNumber;

    @Getter(AccessLevel.PRIVATE)
    private String password;
    
}
