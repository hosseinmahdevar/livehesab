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
@Table(name = "OFFICE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Office extends BaseEntity<UUID> {
    private String name;
    private String address;
    private String postalCode;
    @ManyToOne
    @JoinColumn(name = "FK_CITY")
    private City city;
}
