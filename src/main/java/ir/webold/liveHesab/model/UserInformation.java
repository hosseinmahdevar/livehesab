package ir.webold.liveHesab.model;

import ir.webold.liveHesab.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class UserInformation extends BaseEntity<UUID> {

    @Column(name = "FIRSTNAME" ,length = 20)
    private String firstName;

    @Column(name = "LASTNAME",length = 20)
    private String lastName;


}
