package com.company.home.bookkeeping.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "HOMEBOOKKEEPINGCUBA_TRANSFER")
@Entity(name = "homebookkeepingcuba_Transfer")
public class Transfer extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 4727519992233970789L;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Double amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private Users user;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_FROM_ID")
    private AcoountTable accountFrom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUN_TO_ID")
    private AcoountTable accounTo;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public AcoountTable getAccounTo() {
        return accounTo;
    }

    public void setAccounTo(AcoountTable accounTo) {
        this.accounTo = accounTo;
    }

    public AcoountTable getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(AcoountTable accountFrom) {
        this.accountFrom = accountFrom;
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