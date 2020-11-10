package com.company.home.bookkeeping.web.screens.expenses;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.Expenses;

@UiController("homebookkeepingcuba_Expenses.browse")
@UiDescriptor("expenses-browse.xml")
@LookupComponent("expensesesTable")
@LoadDataBeforeShow
public class ExpensesBrowse extends StandardLookup<Expenses> {
}