/*
	Comentario de multiplas lineas
*/

--DDL - Criar - Create (Schema, Tabela)
create schema clinica is not exists;

create table clinica.medico(
	id_medico INT primary key generated always as identity, 
	nome TEXT not null,
	crm TEXT not null,
	especialidade text not null
);

create table clinica.paciente(
	id_paciente int primary key generated always as identity,
	nome text not null,
	idade int not null, 
	data_nascimento date not null
);

create table clinica.clinica(
	id_clinica int primary key generated always as identity,
	nome text not null, 
	descricao text not null,
	endereco text
);

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
);

--ALTER - alterar tabela
ALTER TABLE clinica.paciente
add column cpf varchar(14) unique;
--unique - impede que seja cadastrado
-- algo que ja existe no banco.

--Apagar coluna
ALTER TABLE clinica.paciente
DROP COLUMN cpf;

--Renomear tabela
ALTER TABLE clinica.paciente
RENAME TO novopaciente

-- TRUNCATE - Limpa a tabela
--TRUNCATE TABLE clinica.consulta;
--RESTART IDENTITY; --reinicia a sequencia

--Apagar tabela ou schema - DROP
/*
drop table if exists clinica.consulta;
drop table clinica.clinica;
drop table clinica.medico;
drop table clinica.paciente;
*/