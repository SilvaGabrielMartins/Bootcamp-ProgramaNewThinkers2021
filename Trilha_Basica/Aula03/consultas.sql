# Criacao banco de dados
create database restaurante;
use restaurante;

create table coziha (
	tipo varchar(30),
    horaAbertura int,
    horaFechamento int,
    pratoPrincipal varchar(30),
    tempoPreparo int
);

create table funcionario (
	nome varchar(30),
    atividade varchar(30)
);

create table ingrediente (
	nomeIngrediente varchar(30),
    dataValidade date
);

# Insercao valores nas tabelas
insert into cozinha (tipo, horaAbertura, horaFechamento, pratoPrincipal, tempoPreparo)
values("Mineira",14,20,"Feijoada",30);

insert into cozinha (tipo, horaAbertura, horaFechamento, pratoPrincipal, tempoPreparo)
values("Chinesa",10,21,"Yakissoba",40);

insert into cozinha (tipo, horaAbertura, horaFechamento, pratoPrincipal, tempoPreparo)
values("Italiana",13,22,"Yakissoba", 50);

insert into cozinha (tipo, horaAbertura, horaFechamento, pratoPrincipal, tempoPreparo)
values("Arabi",8,18,"Homus",120);

insert into cozinha (tipo, horaAbertura, horaFechamento, pratoPrincipal, tempoPreparo)
values("Japonesa",10,16,"Feijoada", 20);

insert into funcionario
values("Lucas", "Cozinheiro Chefe");

insert into funcionario
values("Alice", "Cozinheira Chefe");

insert into funcionario
values("Tiago", "Cozinheiro Auxiliar");

insert into funcionario
values("Jonas", "Decorador de Pratos");

insert into funcionario
values("Alice", "Garçonete");

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


