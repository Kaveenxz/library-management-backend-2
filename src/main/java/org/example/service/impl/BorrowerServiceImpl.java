package org.example.service.impl;

import org.example.dto.Borrower;
import org.example.entitiy.BorrowerEntity;
import org.example.repository.BorrowerRepository;
import org.example.service.BorrowerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowerServiceImpl implements BorrowerService {

    @Autowired
    BorrowerRepository repository;

    ModelMapper mapper;

    @Bean
    public void setup(){
        this.mapper = new ModelMapper();
    }

    @Override
    public void addBorrower(Borrower borrower) {
        BorrowerEntity entity = mapper.map(borrower, BorrowerEntity.class);
        repository.save(entity);
    }

    @Override
    public List<BorrowerEntity> gerBorrowers() {
        return repository.findAll();
    }

    @Override
    public boolean deleteBorrower(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Borrower getBorrowerById(Long id) {
        Optional<BorrowerEntity> byId = repository.findById(id);
        return mapper.map(byId, Borrower.class);

    }
}
