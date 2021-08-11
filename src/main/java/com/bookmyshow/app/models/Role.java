package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Role extends Auditable {
    private String name;
    private String description;
}
