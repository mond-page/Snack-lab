package com.dig.lombok.getterandsetter;

import lombok.Setter;

public class Marking {

    @Setter(onMethod_ = {@Marker}, onParam_ = {@ParameterMarker})
    private String answer;

}
