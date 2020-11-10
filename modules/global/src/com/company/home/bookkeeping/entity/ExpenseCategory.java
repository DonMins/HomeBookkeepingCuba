package com.company.home.bookkeeping.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "HOMEBOOKKEEPINGCUBA_EXPENSE_CATEGORY")
@Entity(name = "homebookkeepingcuba_ExpenseCategory")
public class ExpenseCategory extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -8606547764363210554L;

    @Lob
    @Column(name = "nameCategory", nullable = false, unique = true)
    @NotNull
    private String nameCategory;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}