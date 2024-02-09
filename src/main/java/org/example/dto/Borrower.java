package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {
    private long id;
    private String Fname;
    private String Lname;
    private String address;
    private Integer teleNo;
}
