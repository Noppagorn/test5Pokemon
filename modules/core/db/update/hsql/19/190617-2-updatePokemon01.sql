alter table TEST5POKEMON_POKEMON add constraint FK_TEST5POKEMON_POKEMON_ON_TRAIN foreign key (TRAIN_ID) references TEST5POKEMON_TRAINER(ID);
create index IDX_TEST5POKEMON_POKEMON_ON_TRAIN on TEST5POKEMON_POKEMON (TRAIN_ID);