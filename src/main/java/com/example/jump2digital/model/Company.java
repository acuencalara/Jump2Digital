package com.example.jump2digital.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;

@Entity (name="company")
@Getter
@Setter
@ToString
public class Company {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private String website;
    private String name;
    @Digits(integer = 4, fraction = 0)
    private Integer founded;
    private String size;
    private String locality;
    private String region;
    private String country;
    private String industry;
    @Column(name="linkedin_url")
    private String linkedinUrl;

    public Company(String id, String website, String name, Integer founded, String size, String locality, String region, String country, String industry, String linkedinUrl) {
        this.id = id;
        this.website = website;
        this.name = name;
        this.founded = founded;
        this.size = size;
        this.locality = locality;
        this.region = region;
        this.country = country;
        this.industry = industry;
        this.linkedinUrl = linkedinUrl;
    }

    public Company() {
    }

}
