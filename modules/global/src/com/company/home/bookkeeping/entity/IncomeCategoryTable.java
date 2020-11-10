package com.company.home.bookkeeping.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "HOMEBOOKKEEPINGCUBA_INCOME_CATEGORY_TABLE")
@Entity(name = "homebookkeepingcuba_IncomeCategoryTable")
public class IncomeCategoryTable extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -1943426423292111782L;

    @NotNull
    @Lob
    @Column(name = "nameCategory", nullable = false, unique = true)
    private String nameCategory;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}