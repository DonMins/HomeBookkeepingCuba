package com.company.home.bookkeeping.web.screens.acoounttable;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.AcoountTable;

@UiController("homebookkeepingcuba_AcoountTable.browse")
@UiDescriptor("acoount-table-browse.xml")
@LookupComponent("acoountTablesTable")
@LoadDataBeforeShow
public class AcoountTableBrowse extends StandardLookup<AcoountTable> {
}