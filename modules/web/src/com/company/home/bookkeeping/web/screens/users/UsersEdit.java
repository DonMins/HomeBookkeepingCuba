package com.company.home.bookkeeping.web.screens.users;

import com.haulmont.cuba.gui.screen.*;
import com.company.home.bookkeeping.entity.Users;

@UiController("homebookkeepingcuba_Users.edit")
@UiDescriptor("users-edit.xml")
@EditedEntityContainer("usersDc")
@LoadDataBeforeShow
public class UsersEdit extends StandardEditor<Users> {
}