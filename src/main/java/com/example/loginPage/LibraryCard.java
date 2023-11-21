package com.example.loginPage;

import javax.persistence.*;

@Entity
@Table(name = "library_card")
public class LibraryCard {
    @Id
    private int carNo;
    private int fine;
    private int bookIssued;
    @Enumerated(value = EnumType.STRING) // to store the value in String format in DB (since we create new datatype)
    private CardStatus cardStatus;

    @OneToOne
    @JoinColumn
    private User user;
}
