create table HOMEBOOKKEEPINGCUBA_EXPENSES (
    ID integer not null,
    --
    nameCategory longvarchar not null,
    date timestamp not null,
    account integer,
    amount double precision not null,
    --
    primary key (ID)
);