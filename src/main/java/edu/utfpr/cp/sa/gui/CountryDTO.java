package edu.utfpr.cp.sa.gui;

import lombok.Data;

@Data
public class CountryDTO {
    
    private Long id;
    private String name;
    private String acronym;
    private int phoneDigits;
}