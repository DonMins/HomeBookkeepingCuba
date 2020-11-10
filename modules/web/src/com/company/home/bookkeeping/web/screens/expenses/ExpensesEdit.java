package com.company.home.bookkeeping.web.screens.expenses;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.Expenses;

@UiController("homebookkeepingcuba_Expenses.edit")
@UiDescriptor("expenses-edit.xml")
@EditedEntityContainer("expensesDc")
@LoadDataBeforeShow
public class ExpensesEdit extends StandardEditor<Expenses> {
}