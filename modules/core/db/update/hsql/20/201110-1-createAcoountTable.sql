create table HOMEBOOKKEEPINGCUBA_ACOOUNT_TABLE (
    ID integer not null,
    --
    balance double precision,
    cartNum varchar(255) not null,
    name varchar(255),
    description longvarchar,
    --
    primary key (ID)
);