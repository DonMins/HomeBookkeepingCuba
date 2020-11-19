package com.company.home.bookkeeping.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "HOMEBOOKKEEPINGCUBA_EXPENSES")
@Entity(name = "homebookkeepingcuba_Expenses")
public class Expenses extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -5559982530797813836L;

    @JoinColumn(name = "NAME_CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private ExpenseCategory nameCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private Users user;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account")
    private AcoountTable account;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Double amount;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setNameCategory(ExpenseCategory nameCategory) {
        this.nameCategory = nameCategory;
    }

    public ExpenseCategory getNameCategory() {
        return nameCategory;
    }

    public AcoountTable getAccount() {
        return account;
    }

    public void setAccount(AcoountTable account) {
        this.account = account;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}