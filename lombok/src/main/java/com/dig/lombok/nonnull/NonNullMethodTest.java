package com.dig.lombok.nonnull;

import lombok.NonNull;

public class NonNullMethodTest {

    public void nonNullAnnotation(@NonNull String str) {
        System.out.println(str);
    }
}
