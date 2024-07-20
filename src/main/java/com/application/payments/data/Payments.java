package com.application.payments.data;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Payments {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String userName;
    private String userAccount;
    private String accountType;
    private Long accountNo;
    private Long balance;


}
