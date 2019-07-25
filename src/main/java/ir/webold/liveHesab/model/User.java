package ir.webold.liveHesab.model;

import ir.webold.liveHesab.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "SEC_USERS")
public class User extends BaseEntity<UUID> {
    @NonNull
    @Column(name = "USERNAME" ,length = 20)
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ISACTIVE")
    private boolean isActive;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
