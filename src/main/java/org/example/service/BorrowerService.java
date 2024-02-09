package org.example.service;

import org.example.dto.Borrower;
import org.example.entitiy.BorrowerEntity;

import java.util.List;

public interface BorrowerService {
    void addBorrowe(BorrowerEntity borrower);
    List<Borrower> gerBorrowers();
    boolean deleteBorrower(Long id);
    Borrower getBorrowerById(Long id);
}
