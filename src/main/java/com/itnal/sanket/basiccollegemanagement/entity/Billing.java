package com.itnal.sanket.basiccollegemanagement.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "billing")
@SequenceGenerator(name = Billing.BILLING_SEQUENCE_NAME, sequenceName = Billing.BILLING_SEQUENCE_NAME)
public class Billing {
    public static final String BILLING_SEQUENCE_NAME = "BILLING_SEQUENCE_ID";

    @Id
    private Long billingId;

    private String bankAccountNo;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @ToString.Exclude
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
