alter table TEST5POKEMON_POKEMON alter column TYPE_ID rename to TYPE_ID__U57399 ^
alter table TEST5POKEMON_POKEMON alter column TYPE_ID__U57399 set null ;
drop index IDX_TEST5POKEMON_POKEMON_ON_TYPE ;
alter table TEST5POKEMON_POKEMON drop constraint FK_TEST5POKEMON_POKEMON_ON_TYPE ;
alter table TEST5POKEMON_POKEMON alter column NAME rename to NAME__U09018 ^
alter table TEST5POKEMON_POKEMON alter column NAME__U09018 set null ;
alter table TEST5POKEMON_POKEMON add column POKEMON_ID varchar(36) ;
alter table TEST5POKEMON_POKEMON add column AMOUNT decimal(19, 2) ^
update TEST5POKEMON_POKEMON set AMOUNT = 0 where AMOUNT is null ;
alter table TEST5POKEMON_POKEMON alter column AMOUNT set not null ;
alter table TEST5POKEMON_POKEMON add column ATK decimal(19, 2) ^
update TEST5POKEMON_POKEMON set ATK = 0 where ATK is null ;
alter table TEST5POKEMON_POKEMON alter column ATK set not null ;
alter table TEST5POKEMON_POKEMON add column DEF decimal(19, 2) ^
update TEST5POKEMON_POKEMON set DEF = 0 where DEF is null ;
alter table TEST5POKEMON_POKEMON alter column DEF set not null ;
alter table TEST5POKEMON_POKEMON add column LIFE_POINT decimal(19, 2) ^
update TEST5POKEMON_POKEMON set LIFE_POINT = 0 where LIFE_POINT is null ;
alter table TEST5POKEMON_POKEMON alter column LIFE_POINT set not null ;
