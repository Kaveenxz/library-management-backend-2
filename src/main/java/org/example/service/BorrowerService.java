package org.example.service;

import org.example.dto.Borrower;
import org.example.entitiy.BorrowerEntity;

import java.util.List;

public interface BorrowerService {
    void addBorrower(Borrower borrower);
    List<BorrowerEntity> gerBorrowers();
    boolean deleteBorrower(Long id);
    Borrower getBorrowerById(Long id);
}
