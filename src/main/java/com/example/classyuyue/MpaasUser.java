package com.example.classyuyue;

import com.definesys.mpaas.query.annotation.Table;
import com.definesys.mpaas.query.model.MpaasBasePojo;

import java.util.Date;

@Table(value = "mpaas_user")
public class MpaasUser extends MpaasBasePojo {
    private Integer id;
    private String code;
    private String name;
    private Integer age;
    private String email;
    private Date birthday;
    private Double salary;
    private String description;
    private Integer objectVersionNumber;
    private String createdBy;
    private Date creationDate;
    private String lastUpdatedBy;
    private Date lastUpdateDate;
}
