-- begin HOMEBOOKKEEPINGCUBA_EXPENSE_CATEGORY
create table HOMEBOOKKEEPINGCUBA_EXPENSE_CATEGORY (
    ID integer not null,
    --
    nameCategory longvarchar not null,
    USER_ID integer,
    --
    primary key (ID)
)^
-- end HOMEBOOKKEEPINGCUBA_EXPENSE_CATEGORY

-- begin HOMEBOOKKEEPINGCUBA_INCOME
create table HOMEBOOKKEEPINGCUBA_INCOME (
    ID integer not null,
    --
    NAME_CATEGORY_ID integer,
    USER_ID integer,
    amount double precision not null,
    date timestamp not null,
    account integer,
    --
    primary key (ID)
)^
-- end HOMEBOOKKEEPINGCUBA_INCOME
-- begin HOMEBOOKKEEPINGCUBA_EXPENSES
create table HOMEBOOKKEEPINGCUBA_EXPENSES (
    ID integer not null,
    --
    NAME_CATEGORY_ID integer not null,
    USER_ID integer,
    date timestamp not null,
    account integer,
    amount double precision not null,
    --
    primary key (ID)
)^
-- end HOMEBOOKKEEPINGCUBA_EXPENSES
-- begin HOMEBOOKKEEPINGCUBA_INCOME_CATEGORY_TABLE
create table HOMEBOOKKEEPINGCUBA_INCOME_CATEGORY_TABLE (
    ID integer not null,
    --
    nameCategory longvarchar not null,
    USER_ID integer,
    --
    primary key (ID)
)^
-- end HOMEBOOKKEEPINGCUBA_INCOME_CATEGORY_TABLE
-- begin HOMEBOOKKEEPINGCUBA_TRANSFER
create table HOMEBOOKKEEPINGCUBA_TRANSFER (
    ID integer not null,
    --
    amount double precision not null,
    USER_ID integer,
    date timestamp not null,
    ACCOUNT_FROM_ID integer,
    ACCOUN_TO_ID integer,
    --
    primary key (ID)
)^
-- end HOMEBOOKKEEPINGCUBA_TRANSFER
-- begin HOMEBOOKKEEPINGCUBA_USERS
create table HOMEBOOKKEEPINGCUBA_USERS (
    ID integer not null,
    --
    login varchar(255) not null,
    password varchar(255) not null,
    --
    primary key (ID)
)^
-- end HOMEBOOKKEEPINGCUBA_USERS
-- begin ACCOUNT_TABLE1
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
)^
-- end ACCOUNT_TABLE1
