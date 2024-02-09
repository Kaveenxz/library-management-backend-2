package org.example.service.impl;

import org.example.dto.Borrower;
import org.example.service.BorrowerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerServiceImpl implements BorrowerService {
    @Override
    public void addBorrower(Borrower borrower) {

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
