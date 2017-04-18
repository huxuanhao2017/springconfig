package com.huotu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by huxuanhao on 2017-04-17.
 */
@Entity
@Table(name="department")
public class Department implements Serializable{
    @Id
    private Integer id;

    @Column(name="dapartmentName")
    private String dapartmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDapartmentName() {
        return dapartmentName;
    }

    public void setDapartmentName(String dapartmentName) {
        this.dapartmentName = dapartmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", dapartmentName='" + dapartmentName + '\'' +
                '}';
    }
}
