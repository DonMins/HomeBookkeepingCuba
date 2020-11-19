package com.company.home.bookkeeping.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "HOMEBOOKKEEPINGCUBA_EXPENSE_CATEGORY")
@Entity(name = "homebookkeepingcuba_ExpenseCategory")
public class ExpenseCategory extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -8606547764363210554L;

    @Lob
    @Column(name = "nameCategory", nullable = false, unique = true)
    @NotNull
    private String nameCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}