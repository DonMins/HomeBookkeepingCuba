package com.company.home.bookkeeping.web.screens.incomecategorytable;

import com.company.home.bookkeeping.entity.Transfer;
import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.IncomeCategoryTable;

import java.util.Date;

@UiController("homebookkeepingcuba_IncomeCategoryTable.edit")
@UiDescriptor("income-category-table-edit.xml")
@EditedEntityContainer("incomeCategoryTableDc")
@LoadDataBeforeShow
public class IncomeCategoryTableEdit extends StandardEditor<IncomeCategoryTable> {
}