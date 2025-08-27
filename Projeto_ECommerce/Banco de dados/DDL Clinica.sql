/*
	Comentario de multiplas lineas
*/

--DDL - Criar - Create (Schema, Tabela)
create schema clinica

create table clinica.medico(
	id_medico INT primary key generated always as identity, 
	nome TEXT not null,
	crm TEXT not null,
	especialidade text not null
)

create table clinica.paciente(
	id_paciente int primary key generated always as identity,
	nome text not null,
	idade int not null, 
	data_nascimento date not null
)

create table clinica.clinica(
	id_clinica int primary key generated always as identity,
	nome text not null, 
	descricao text not null,
	endereco text
)

create table clinica.consulta(
	id_consulta int primary key generated always as identity,
	data TIMESTAMPTZ not null,
	valor numeric(10,4),
	--maneira extensa
	id_medico int not null, 
	FOREIGN KEY (id_medico)
	references clinica.medico(id_medico),
	--maneira abreviada
	id_clinica int not null references clinica.clinica(id_clinica),
	id_paciente int not null references clinica.paciente(id_paciente)
)

--Apagar tabela ou schema - DROP
drop table clinica.consulta;
drop table clinica.clinica;