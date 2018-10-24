package com.project.starter.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "T_ROLE", uniqueConstraints = @UniqueConstraint(columnNames = "ROL_DESIGNATION"))
public class Role  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROL_ID")
    private int id;

    @Column(name = "ROL_DESIGNATION", unique = true, nullable = false)
    private String designation;

    @Column(name = "ROL_DESCRIPTION", unique = false, nullable = false)
    private String description;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TJ_AUTH_ROLE", joinColumns = { @JoinColumn(name = "ROL_ID", nullable = true, updatable = false) }, inverseJoinColumns = {
            @JoinColumn(name = "AUT_ID", nullable = true, updatable = true) })
    private Set<Authority> authorities = new HashSet<>(0);

    public Role() {
        super();
    }

    public Role(String designation) {
        super();
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        return prime * result + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Role other = (Role) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Role [id=").append(id).append(", designation=").append(designation).append(']');
        return builder.toString();
    }

}