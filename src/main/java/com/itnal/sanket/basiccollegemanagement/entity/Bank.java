package com.itnal.sanket.basiccollegemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "banks")
@SequenceGenerator(name = Bank.BANK_SEQUENCE_NAME, sequenceName = Bank.BANK_SEQUENCE_NAME)
public class Bank {
    public static final String BANK_SEQUENCE_NAME = "BANK_SEQUENCE_ID";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = BANK_SEQUENCE_NAME)
    private Long bankId;

    @Column(nullable = false)
    private String bankName;

    @Column(nullable = false)
    private String branchName;

    @Column(nullable = false)
    private String IFSCCode;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bank")
    private List<Billing> billingAccountList;
}
