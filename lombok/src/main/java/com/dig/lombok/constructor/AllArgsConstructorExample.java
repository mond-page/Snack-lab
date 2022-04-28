package com.dig.lombok.constructor;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class AllArgsConstructorExample {

    @NonNull
    private String id;

    @NonNull
    private String password;

    private String email;
    private final Boolean agreeInformationUsing;
    private static int code;
    private final Boolean vipUser = Boolean.TRUE;
}
