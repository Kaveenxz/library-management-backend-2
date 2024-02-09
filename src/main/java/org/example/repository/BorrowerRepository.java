package org.example.repository;

import org.example.entitiy.BorrowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<BorrowerEntity, Long> {
}
