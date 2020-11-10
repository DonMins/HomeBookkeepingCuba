package com.company.home.bookkeeping.web.screens.income;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.Income;

@UiController("homebookkeepingcuba_Income.browse")
@UiDescriptor("income-browse.xml")
@LookupComponent("incomesTable")
@LoadDataBeforeShow
public class IncomeBrowse extends StandardLookup<Income> {
}