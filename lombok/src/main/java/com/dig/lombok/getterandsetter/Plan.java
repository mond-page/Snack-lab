package com.dig.lombok.getterandsetter;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Plan {

    private String title;
    private LocalDate startDate;
    private LocalDate endDate;

    @Getter(lazy = true)
    private final String precautions = "이 여행상품은 환불이 불가능한 여행상품입니다.";
}
