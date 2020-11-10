package com.company.home.bookkeeping.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "HOMEBOOKKEEPINGCUBA_INCOME")
@Entity(name = "homebookkeepingcuba_Income")
public class Income extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -3054844318756067573L;

    @JoinColumn(name = "NAME_CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private IncomeCategoryTable nameCategory;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Double amount;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account")
    private AcoountTable account;

    public void setNameCategory(IncomeCategoryTable nameCategory) {
        this.nameCategory = nameCategory;
    }

    public IncomeCategoryTable getNameCategory() {
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