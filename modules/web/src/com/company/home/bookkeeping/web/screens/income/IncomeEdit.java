package com.company.home.bookkeeping.web.screens.income;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.Income;

import java.util.Date;

@UiController("homebookkeepingcuba_Income.edit")
@UiDescriptor("income-edit.xml")
@EditedEntityContainer("incomeDc")
@LoadDataBeforeShow
public class IncomeEdit extends StandardEditor<Income> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Income> event) {
        event.getEntity().setDate(new Date());
    }
}