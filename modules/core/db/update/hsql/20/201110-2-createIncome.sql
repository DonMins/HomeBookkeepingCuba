alter table HOMEBOOKKEEPINGCUBA_INCOME add constraint FK_HOMEBOOKKEEPINGCUBA_INCOME_ON_ACCOUNT foreign key (ACCOUNT) references HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE(ID);
create index IDX_HOMEBOOKKEEPINGCUBA_INCOME_ON_ACCOUNT on HOMEBOOKKEEPINGCUBA_INCOME (ACCOUNT);
