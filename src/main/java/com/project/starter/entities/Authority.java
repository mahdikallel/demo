package com.project.starter.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_AUTHORITY", uniqueConstraints = @UniqueConstraint(columnNames = "AUT_DESIGNATION"))
public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUT_ID")
    private int id;

    @Column(name = "AUT_DESIGNATION", unique = true, nullable = false)
    private String designation;

    @Column(name = "AUT_DESCRIPTION")
    private String description;

    public Authority() {
        super();
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((designation == null) ? 0 : designation.hashCode());
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
        Authority other = (Authority) obj;
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (designation == null) {
            if (other.designation != null) {
                return false;
            }
        } else if (!designation.equals(other.designation)) {
            return false;
        }
        if (id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Authority [id=").append(id).append(", designation=").append(designation).append(", description=").append(description).append(']');
        return builder.toString();
    }

}
