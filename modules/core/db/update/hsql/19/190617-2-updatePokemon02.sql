-- update TEST5POKEMON_POKEMON set TRAIN_ID = <default_value> where TRAIN_ID is null ;
alter table TEST5POKEMON_POKEMON alter column TRAIN_ID set not null ;
