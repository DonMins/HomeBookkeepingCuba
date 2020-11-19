alter table HOMEBOOKKEEPINGCUBA_EXPENSES add constraint FK_HOMEBOOKKEEPINGCUBA_EXPENSES_ON_ACCOUNT foreign key (ACCOUNT) references account_table1(ID);
