alter table account_table1 add constraint FK_ACCOUNT_TABLE1_ON_USER foreign key (USER_ID) references HOMEBOOKKEEPINGCUBA_USERS(ID);
create unique index IDX_account_table1_UNIQ_CARTNUM on account_table1 (cartNum);
create index IDX_ACCOUNT_TABLE1_ON_USER on account_table1 (USER_ID);
