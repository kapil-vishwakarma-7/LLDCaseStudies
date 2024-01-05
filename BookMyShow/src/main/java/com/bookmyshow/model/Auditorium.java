package com.bookmyshow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class Auditorium {
    private Threater threater;
    private String name;
    private List<AudiFeature> audiFeatures;
}
