-- begin TEST5POKEMON_TRAINER
create table TEST5POKEMON_TRAINER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    MONEY decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end TEST5POKEMON_TRAINER
-- begin TEST5POKEMON_TYPE
create table TEST5POKEMON_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end TEST5POKEMON_TYPE
-- begin TEST5POKEMON_POKEMON
create table TEST5POKEMON_POKEMON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TYPE_ID varchar(36) not null,
    TRAINER_ID varchar(36),
    --
    primary key (ID)
)^
-- end TEST5POKEMON_POKEMON
