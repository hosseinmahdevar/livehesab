package ir.webold.liveHesab.model;

import ir.webold.liveHesab.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "AC_BANK_ACCOUNT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount extends BaseEntity<UUID> {
    private String number;
    @ManyToOne
    @JoinColumn(name = "FK_BANK")
    private Bank bank;
}
