package com.bookmyshow.app.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role extends Auditable {
    private String name;
    private String description;

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                super.toString() +
                '}';
    }
}
