package com.company.home.bookkeeping.web.screens.expensecategory;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.ExpenseCategory;

@UiController("homebookkeepingcuba_ExpenseCategory.edit")
@UiDescriptor("expense-category-edit.xml")
@EditedEntityContainer("expenseCategoryDc")
@LoadDataBeforeShow
public class ExpenseCategoryEdit extends StandardEditor<ExpenseCategory> {
}