package org.example.service.impl;

import org.example.dto.Borrower;
import org.example.entitiy.BorrowerEntity;
import org.example.service.BorrowerService;

import java.util.List;

public class BorrowerServiceImpl implements BorrowerService {
    @Override
    public void addBorrowe(BorrowerEntity borrower) {

    }

    @Override
    public List<Borrower> gerBorrowers() {
        return null;
    }

    @Override
    public boolean deleteBorrower(Long id) {
        return false;
    }

    @Override
    public Borrower getBorrowerById(Long id) {
        return null;
    }
}
