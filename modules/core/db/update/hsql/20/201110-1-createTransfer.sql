create table HOMEBOOKKEEPINGCUBA_TRANSFER (
    ID integer not null,
    --
    amount double precision not null,
    date timestamp not null,
    ACCOUNT_FROM_ID integer,
    ACCOUN_TO_ID integer,
    --
    primary key (ID)
);