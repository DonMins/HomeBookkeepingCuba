alter table HOMEBOOKKEEPINGCUBA_INCOME_CATEGORY_TABLE add constraint FK_HOMEBOOKKEEPINGCUBA_INCOME_CATEGORY_TABLE_ON_USER foreign key (USER_ID) references HOMEBOOKKEEPINGCUBA_USERS(ID);
create index IDX_HOMEBOOKKEEPINGCUBA_INCOME_CATEGORY_TABLE_ON_USER on HOMEBOOKKEEPINGCUBA_INCOME_CATEGORY_TABLE (USER_ID);
