package ir.webold.liveHesab.model;

import ir.webold.liveHesab.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "INF_STATES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class State extends BaseEntity<UUID> {
    private String name;
    private String code;
    @OneToMany(mappedBy = "state",fetch = FetchType.EAGER)
    private List<City> cities;
}
