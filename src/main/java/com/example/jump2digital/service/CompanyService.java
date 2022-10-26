package com.example.jump2digital.service;

import com.example.jump2digital.model.Company;
import com.example.jump2digital.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.data.util.Predicates;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> findByOrderBySizeAsc() {

        Comparator<Company> bySize =
                (Company c1, Company c2)->
                {
                    String sizeC1 = c1.getSize();
                    String sizeC2 = c2.getSize();
                    String maxSizeC1 = sizeC1.split("[-]|[+]")[0];
                    Integer intMaxSizeC1 = Integer.parseInt(maxSizeC1);
                    String maxSizeC2 = sizeC2.split("[-]|[+]")[0];
                    Integer intMaxSizeC2 = Integer.parseInt(maxSizeC2);
                    return intMaxSizeC1.compareTo(intMaxSizeC2);
                };

        List<Company> companyList = companyRepository.findAll().stream().sorted(bySize).toList();

        return companyList;
    }

    public List<Company> findByOrderByFoundedAsc(){
        List<Company> companyList = companyRepository.findByOrderByFoundedAsc();
        return companyList;
    }
}
