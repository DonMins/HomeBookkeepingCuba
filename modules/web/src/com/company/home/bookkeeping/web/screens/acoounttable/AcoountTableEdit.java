package com.company.home.bookkeeping.web.screens.acoounttable;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.AcoountTable;

@UiController("homebookkeepingcuba_AcoountTable.edit")
@UiDescriptor("acoount-table-edit.xml")
@EditedEntityContainer("acoountTableDc")
@LoadDataBeforeShow
public class AcoountTableEdit extends StandardEditor<AcoountTable> {
}