package com.company.home.bookkeeping.web.screens.transfer;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.Transfer;

@UiController("homebookkeepingcuba_Transfer.browse")
@UiDescriptor("transfer-browse.xml")
@LookupComponent("transfersTable")
@LoadDataBeforeShow
public class TransferBrowse extends StandardLookup<Transfer> {
}