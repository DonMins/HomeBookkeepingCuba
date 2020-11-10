alter table HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE alter column DESCRIPTION rename to DESCRIPTION__U01409 ^
-- alter table HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE add column USER_ID integer ^
-- update HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE set USER_ID = <default_value> ;
-- alter table HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE alter column USER_ID set not null ;
alter table HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE add column USER_ID integer not null ;
alter table HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE add column DESCRIPTION varchar(255) ;
