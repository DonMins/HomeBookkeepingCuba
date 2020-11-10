create table HOMEBOOKKEEPINGCUBA_INCOME (
    ID integer not null,
    --
    nameCategory longvarchar not null,
    amount double precision not null,
    date timestamp not null,
    account integer,
    --
    primary key (ID)
);