package com.hirewheel.hirewheel.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId ;

    @Column(nullable = false, length = 25)
    private String firstName ;

    @Column(nullable = true, length = 20)
    private String lastName ;

    @Column(nullable = false)
    private String password ;

    @Column(nullable = false, unique = true)
    private String email ;

    @Column(nullable = false, length = 10, unique = true)
    private String  mobileNumber ;

    @Column(nullable = false)
    private double walletMoney = 10000.00 ;

   @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "user")
   private Set<Booking> bookings ;

   @ManyToOne
   @JoinColumn(name = "roleId", nullable = false)
   private Role role ;

   public Users(){

   }

    public Users(String firstName, String lastName, String password, String email, String mobileNumber, double walletMoney, Role role) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.walletMoney = walletMoney;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(double walletMoney) {
        this.walletMoney = walletMoney;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", walletMoney=" + walletMoney +
                '}';
    }
}
