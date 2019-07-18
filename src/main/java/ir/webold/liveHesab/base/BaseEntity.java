package ir.webold.liveHesab.base;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseEntity <ID extends Serializable> implements Serializable {
    @Transient
    private static final long serialVersionUID = 6488252903669024162L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private ID id;
    @Column(name = "USER_IP",length = 15)
    private String userip;

    @CreatedDate
    @UpdateTimestamp
    @Column(name = "CREATED_DATE")
    private Date createDate;
    {
        createDate = new Date();
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
