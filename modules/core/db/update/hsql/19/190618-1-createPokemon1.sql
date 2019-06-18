create table TEST5POKEMON_POKEMON_1 (
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
    TYPE_ID varchar(36),
    LIFE_POINT decimal(19, 2) not null,
    ATK decimal(19, 2) not null,
    DEF_DEFAULT decimal(19, 2) not null,
    --
    primary key (ID)
);