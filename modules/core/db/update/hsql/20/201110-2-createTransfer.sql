alter table HOMEBOOKKEEPINGCUBA_TRANSFER add constraint FK_HOMEBOOKKEEPINGCUBA_TRANSFER_ON_ACCOUNT_FROM foreign key (ACCOUNT_FROM_ID) references HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE(ID);
alter table HOMEBOOKKEEPINGCUBA_TRANSFER add constraint FK_HOMEBOOKKEEPINGCUBA_TRANSFER_ON_ACCOUN_TO foreign key (ACCOUN_TO_ID) references HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE(ID);
create index IDX_HOMEBOOKKEEPINGCUBA_TRANSFER_ON_ACCOUNT_FROM on HOMEBOOKKEEPINGCUBA_TRANSFER (ACCOUNT_FROM_ID);
create index IDX_HOMEBOOKKEEPINGCUBA_TRANSFER_ON_ACCOUN_TO on HOMEBOOKKEEPINGCUBA_TRANSFER (ACCOUN_TO_ID);