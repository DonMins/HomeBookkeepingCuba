package com.company.home.bookkeeping.web.screens.incomecategorytable;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.IncomeCategoryTable;

@UiController("homebookkeepingcuba_IncomeCategoryTable.browse")
@UiDescriptor("income-category-table-browse.xml")
@LookupComponent("incomeCategoryTablesTable")
@LoadDataBeforeShow
public class IncomeCategoryTableBrowse extends StandardLookup<IncomeCategoryTable> {
}