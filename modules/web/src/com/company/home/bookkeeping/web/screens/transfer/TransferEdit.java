package com.company.home.bookkeeping.web.screens.transfer;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.Transfer;

@UiController("homebookkeepingcuba_Transfer.edit")
@UiDescriptor("transfer-edit.xml")
@EditedEntityContainer("transferDc")
@LoadDataBeforeShow
public class TransferEdit extends StandardEditor<Transfer> {
}