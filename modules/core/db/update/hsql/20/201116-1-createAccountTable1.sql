create table account_table1 (
    ID integer not null,
    --
    balance double precision,
    cartNum varchar(255) not null,
    name varchar(255),
    description varchar(255),
    USER_ID integer not null,
    --
    primary key (ID)
);