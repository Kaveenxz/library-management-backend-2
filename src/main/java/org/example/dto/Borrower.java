package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {
    private Long id;
    private String fName;
    private String lName;
    private String address;
    private String teleNo;
}
