package com.test.demo.model;

import javax.persistence.Column;

public class BaseModel {

    @Column(name = "created_at")
    private Long createdAt;

    @Column(name = "updated_at")
    private Long updatedAt;

    @Column(name = "is_active")
    private boolean isActive;
}
