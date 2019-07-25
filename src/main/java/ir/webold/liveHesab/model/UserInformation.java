package ir.webold.liveHesab.model;

import ir.webold.liveHesab.base.BaseEntity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "SEC_USERINFORMATION")
public class UserInformation extends BaseEntity<UUID> {

    @Column(name = "FIRSTNAME" ,length = 20)
    private String firstName;

    @Column(name = "LASTNAME",length = 20)
    private String lastName;

    @Column(name = "ISSUENUMBER" ,length = 12)
    private String issueNumber;

    @Column(name = "IDNUMBER" ,length = 12)
    private String idNumber;

    @Column(name = "TELL" ,length = 15)
    private String tell;

    @Column(name = "MOBILE" ,length = 15)
    private String mobile;

    @Column(name = "ADRESS")
    private String adress;

    @Column(name = "POSTALCODE" ,length = 15)
    private String postalCode;

    @Column(name = "EMAIL" ,length = 50)
    private String email;


    @JoinColumn(name = "SEC_USERINFORMATION", referencedColumnName = "SEC_USERS")
    @Column(name = "SEC_USERS_FK")
    private User user;


}
