package org.example.service;

import org.example.dto.Borrower;

import java.util.List;

public interface BorrowerService {
    void addBorrower(Borrower borrower);
    List<Borrower> gerBorrowers();
    boolean deleteBorrower(Long id);
    Borrower getBorrowerById(Long id);
}
