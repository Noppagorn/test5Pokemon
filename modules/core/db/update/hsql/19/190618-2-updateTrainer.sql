alter table TEST5POKEMON_TRAINER alter column AMOUNT rename to AMOUNT__U89235 ^
alter table TEST5POKEMON_TRAINER add column MONEY decimal(19, 2) ^
update TEST5POKEMON_TRAINER set MONEY = 0 where MONEY is null ;
alter table TEST5POKEMON_TRAINER alter column MONEY set not null ;
