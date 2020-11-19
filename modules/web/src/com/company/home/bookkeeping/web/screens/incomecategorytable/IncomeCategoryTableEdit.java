package com.company.home.bookkeeping.web.screens.incomecategorytable;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.IncomeCategoryTable;

@UiController("homebookkeepingcuba_IncomeCategoryTable.edit")
@UiDescriptor("income-category-table-edit.xml")
@EditedEntityContainer("incomeCategoryTableDc")
@LoadDataBeforeShow
public class IncomeCategoryTableEdit extends StandardEditor<IncomeCategoryTable> {
}