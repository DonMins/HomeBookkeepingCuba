package com.company.home.bookkeeping.web.screens.expensecategory;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.ExpenseCategory;

@UiController("homebookkeepingcuba_ExpenseCategory.browse")
@UiDescriptor("expense-category-browse.xml")
@LookupComponent("expenseCategoriesTable")
@LoadDataBeforeShow
public class ExpenseCategoryBrowse extends StandardLookup<ExpenseCategory> {
}