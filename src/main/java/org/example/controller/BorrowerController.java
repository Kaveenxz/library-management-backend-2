package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Borrower;
import org.example.entitiy.BorrowerEntity;
import org.example.service.BorrowerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrower")
@RequiredArgsConstructor
@CrossOrigin
public class BorrowerController {

    final BorrowerService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }

    @GetMapping("/get")
    public Iterable<BorrowerEntity> getBorrowers(){
        return service.gerBorrowers();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteBorrower(@PathVariable Long id){
        service.deleteBorrower(id) ;
        return "delete";

    }

    @GetMapping("serch/{id}")
    public Borrower getBookBuId(@PathVariable Long id){
        return service.getBorrowerById(id);
    }


    @GetMapping()
    public List<> getAllUsers(){
        return null;
    }

}
