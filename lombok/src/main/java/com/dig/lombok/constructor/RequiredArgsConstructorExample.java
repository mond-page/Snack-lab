package com.dig.lombok.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
public class RequiredArgsConstructorExample {

    @NonNull
    private String id;

    @NonNull
    private String password;

    private String email;
    private final Boolean agreeInformationUsing;
    private static int code;
    private final Boolean vipUser = Boolean.TRUE;
}
