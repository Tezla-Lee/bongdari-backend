package com.usbridge.bongdari.model;

import com.usbridge.bongdari.model.enums.Gender;
import com.usbridge.bongdari.model.enums.SNS;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String nickname;

    private String email;

    private String contact;

    private Boolean smsAgreement;

    private Boolean isDeleted;

    private LocalDate birthDate;

    private LocalDate createdDate;

    private Gender gender;

    private SNS sns;
}
