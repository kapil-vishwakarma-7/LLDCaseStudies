package com.bookmyshow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Threater {
    private City city;
    private String address;
    private String name;
    private List<Auditorium> auditoriumList;
    private List<Show> shows;
}
