package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
public abstract class Auditable implements Cloneable {
    private Long id; // database id
    private Date created;
    private Date updated;
    private boolean deleted;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auditable)) return false;
        Auditable auditable = (Auditable) o;
        return Objects.equals(id, auditable.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
