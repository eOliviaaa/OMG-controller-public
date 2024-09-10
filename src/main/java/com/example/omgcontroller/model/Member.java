package com.example.omgcontroller.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="member")
public class Member {
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="forename")
    private String forename;
    @Column(name="surname")
    private String surname;
    @Column(name="email")
    private String email;
    @Column(name="address")
    private String address;
    @Column(name="postcode")
    private Long postcode;
    @Column(name="postplace")
    private String postplace;
    @Column(name="discord")
    private String discord;
    @Column(name="birthday")
    private Date birthday;
    @Column(name="membership")
    private String membership;
    @Column(name="membership_start")
    private Date membership_start;
    @Column(name="membership_expiry")
    private Date membership_expiry;
    @Column(name="is_student")
    private boolean is_student;
    @Column(name="payment")
    private String payment;

    protected Member() {}

    public Member(String forename, String surname, String email, String address, Long postcode, String postplace,
                  String discord, Date birthday, String membership, Date membership_start, Date membership_expiry,
                  boolean is_student, String payment) {
        this.forename = forename;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.postplace = postplace;
        this.discord = discord;
        this.birthday = birthday;
        this.membership = membership;
        this.membership_start = membership_start;
        this.membership_expiry = membership_expiry;
        this.is_student = is_student;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return String.format(
                "Member[id=%d, forename=%s, surname=%s, email=%s, address=%s, postcode=%d, postplace=%s discord=%s," +
                        " birthday=%s, membership=%s, membership_start=%s, membership_expiry=%s, is_student=%s, payment=%s]",
                id, forename, surname, email, address, postcode, postplace, discord, birthday, membership,
                membership_start, membership_expiry, is_student, payment
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return is_student == member.is_student && Objects.equals(id, member.id) && Objects.equals(forename, member.forename) && Objects.equals(surname, member.surname) && Objects.equals(email, member.email) && Objects.equals(address, member.address) && Objects.equals(postcode, member.postcode) && Objects.equals(postplace, member.postplace) && Objects.equals(discord, member.discord) && Objects.equals(birthday, member.birthday) && Objects.equals(membership, member.membership) && Objects.equals(membership_start, member.membership_start) && Objects.equals(membership_expiry, member.membership_expiry) && Objects.equals(payment, member.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, forename, surname, email, address, postcode, postplace, discord, birthday, membership, membership_start, membership_expiry, is_student, payment);
    }
}
