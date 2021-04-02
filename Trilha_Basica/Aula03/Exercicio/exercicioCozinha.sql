#1 Criar banco de dados restaurante
create database restaurante
default character set utf8
default collate utf8_general_ci;

use restaurante;

#2 Criar as tabelas cozinha, ingrediente e funcionario
create table if not exists cozinha (
	idCoz int not null auto_increment,
	tipo varchar(30) not null,
    horaAbertura tinyint not null,
    horaFechamento tinyint not null,
    pratoPrincipal varchar(30),
    tempoPreparo int,
    primary key (idCoz)
) default charset = utf8;

create table if not exists funcionario (
	idFunc int not null auto_increment,
	nome varchar(30) not null,
    dataNascimento date,
    atividade varchar(30),
    primary key (idFunc)
);

create table if not exists ingrediente (
	idIngre int not null auto_increment,
	nomeIngrediente varchar(30) not null,
    dataValidade datetime,
    primary key (idIngre)
);

#4 Incluir 5 itens na tabela cozinha, 8 na tabela ingredientes e 10 na tabela funcionarios

# Cozinhas
insert into cozinha (tipo, horaAbertura, horaFechamento, pratoPrincipal, tempoPreparo)
values("Mineira",14,20,"Feijoada",30),
("Chinesa",10,21,"Yakissoba",40),
("Italiana",13,22,"Yakissoba", 50),
("Arabi",8,18,"Homus",120),
("Japonesa",10,16,"Sushi", 20),
("Alemã",13,21,"Salsicha", 15),
("Indiana",07,17,"Frango Lasooni", 90);

# Ingredientes
insert into ingrediente (nomeIngrediente, dataValidade)
values("Feijão","2021-03-20 18:00:00"),
("Farinha","2022-10-03 19:00:00"),
("Feijão","2021-03-20 18:00:00"),
("Arroz","2022-10-13 12:00:00"),
("Carne de Porco","2021-04-01 16:00:00"),
("Linguiça","2022-12-13 19:00:00"),
("Feijoada","2023-03-20 15:00:00"),
("Yakissoba","2023-01-20 18:00:00"),
("Yakissoba","2023-08-20 18:00:00"),
("Homus","2023-07-20 15:00:00"),
("Sushi","2021-05-15 12:00:00"),
("Salsicha","2021-03-15 18:00:00"),
("Frango Lasooni","2022-01-01 17:00:00");

# Funcionarios
insert into funcionario (nome,atividade)
values("Lucas", "Cozinheiro Chefe"),
("Mario", "Cozinheiro Chefe"),
("Alice", "Cozinheira Chefe"),
("Mônica", "Cozinheira Chefe"),
("Tiago", "Cozinheiro Auxiliar"),
("Isabela", "Cozinheira Auxiliar"),
("Jonas", "Decorador de Pratos"),
("Júlia", "Decoradora de Pratos"),
("Alice", "Garçonete"),
("Mariana", "Garçonete"),
("Pedro", "Garçom");

#5 Consulta que retorne a quantidade de cozinhas
select count(*) as "Total Cozinhas" from cozinha;

#6 Consulta de cozinhas que possuem horario de fechamento as 22horas
select tipo as Cozinha from cozinha
where horaFechamento = 22; 

#7 Listar ingredientes vencidos
select * from ingrediente
where dataValidade < now();

#8 Criar relacionamentos entre as tabelas
alter table ingrediente
add column idCozinha int;

alter table ingrediente
add foreign key (idCozinha)
references cozinha(idCoz);

alter table funcionario
add column idCozinha int;

alter table funcionario
add foreign key (idCozinha)
references cozinha(idCoz);

# Atualizando qual cozinha pertence, cada ingrediente
update ingrediente
set idCozinha = 3
where idIngre = 1;

update ingrediente
set idCozinha = 1
where idIngre = 2;

update ingrediente
set idCozinha = 6
where idIngre = 4;

update ingrediente
set idCozinha = 3
where idIngre = 6;

update ingrediente
set idCozinha = 4
where idIngre = 8;

update ingrediente
set idCozinha = 2
where idIngre = 10;

#Atualizando chaves estrangeiras dos funcionarios
update funcionario set idCozinha = 1 where idFunc = 1;
update funcionario set idCozinha = 2 where idFunc = 2;
update funcionario set idCozinha = 1 where idFunc = 3;
update funcionario set idCozinha = 3 where idFunc = 4;
update funcionario set idCozinha = 1 where idFunc = 5;
update funcionario set idCozinha = 2 where idFunc = 6;
update funcionario set idCozinha = 1 where idFunc = 7;
update funcionario set idCozinha = 2 where idFunc = 8;
update funcionario set idCozinha = 1 where idFunc = 9;
update funcionario set idCozinha = 2 where idFunc = 10;
update funcionario set idCozinha = 3 where idFunc = 11;

#9 Criar uma consulta que realize a junção das tabelas Cozinha, Ingrediente e Funcionario e informe as cozinhas não possuam ingredientes.
select distinct idCoz, tipo from cozinha 
join ingrediente, funcionario
where not exists (
	select ingrediente.idCozinha 
    from ingrediente
    where cozinha.idCoz = ingrediente.idCozinha
);

#10  Criar uma consulta que realize a junção das tabelas Cozinha, Ingrediente e Funcionario e informe as cozinhas que possuam número de funcionários maior que 4;
select idCoz from cozinha
join ingrediente, funcionario
where exists ( 
	select funcionario.idCozinha, count(idCozinha) 
	from funcionario
	group by idCozinha
	having count(idCozinha) > 4
);

# Correcao estrutura tabela
alter table coziha rename cozinha;

drop database restaurante;

#Consultas

# Cozinhas que abrem as 10h
select * from cozinha
where horaAbertura = 10;

# Quantidades de cozinhas que funcionam depois das 20h
select count(2) as CozinhasNoturnas from cozinha
where horaFechamento > 20;

# Listar nomes de funcionarios cozinheiros
select * from  funcionario
where atividade like 'Cozinheir%';

# Listar todos os funcionarios em ordem alfabetica
select * from funcionario
order by nome;

delete from cozinha;
delete from funcionario;
 
drop table cozinha, funcionario, ingrediente;