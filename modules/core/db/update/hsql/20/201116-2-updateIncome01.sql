alter table HOMEBOOKKEEPINGCUBA_INCOME add constraint FK_HOMEBOOKKEEPINGCUBA_INCOME_ON_ACCOUNT foreign key (ACCOUNT) references account_table1(ID);
