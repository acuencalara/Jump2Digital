package com.example.jump2digital.repository;

import com.example.jump2digital.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQueries;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
    @Query("select c from company c order by c.founded")
    List<Company> findByOrderByFoundedAsc();

    @Query("select c from company c order by c.industry")
    List<Company> findByOrderByIndustryAsc();

    @Query(value = "SELECT COUNT(id), industry FROM jump2digital.company GROUP BY industry ORDER BY COUNT(id)",nativeQuery = true)
    List<Object[]> findNumberCompaniesInEachIndustry();

    @Query()


    @Query("select count(c) from company c where c.industry = ?1")
    long countByIndustry(String industry);



}

