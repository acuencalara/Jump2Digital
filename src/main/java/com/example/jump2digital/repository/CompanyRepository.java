package com.example.jump2digital.repository;

import com.example.jump2digital.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQueries;
import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
    @Query("select c from company c order by c.founded")
    List<Company> findByOrderByFoundedAsc();

}

