package com.usbridge.bongdari.model;

import com.usbridge.bongdari.model.enums.Gender;
import com.usbridge.bongdari.model.enums.SNS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@Data
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
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

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private SNS sns;
}
