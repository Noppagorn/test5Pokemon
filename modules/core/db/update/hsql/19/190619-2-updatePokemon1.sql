alter table TEST5POKEMON_POKEMON_1 alter column ATK rename to ATK__U56545 ^
alter table TEST5POKEMON_POKEMON_1 alter column ATK__U56545 set null ;
alter table TEST5POKEMON_POKEMON_1 alter column LIFE_POINT rename to LIFE_POINT__U29440 ^
alter table TEST5POKEMON_POKEMON_1 alter column LIFE_POINT__U29440 set null ;
alter table TEST5POKEMON_POKEMON_1 add column ATK_DEFAULT decimal(19, 2) ^
update TEST5POKEMON_POKEMON_1 set ATK_DEFAULT = 0 where ATK_DEFAULT is null ;
alter table TEST5POKEMON_POKEMON_1 alter column ATK_DEFAULT set not null ;
alter table TEST5POKEMON_POKEMON_1 add column LIFE_POINT_DEFAULT decimal(19, 2) ^
update TEST5POKEMON_POKEMON_1 set LIFE_POINT_DEFAULT = 0 where LIFE_POINT_DEFAULT is null ;
alter table TEST5POKEMON_POKEMON_1 alter column LIFE_POINT_DEFAULT set not null ;
