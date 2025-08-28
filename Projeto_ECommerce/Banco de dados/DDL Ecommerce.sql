CREATE SCHEMA ecommerce;

CREATE TABLE ecommerce.cliente(
	id_cliente INT primary key generated always as identity, 
	nome TEXT not null,
	email TEXT not null,
	senha TEXT not null,
	telefone VARCHAR(11),
	especialidade text not null
);

CREATE TABLE ecommerce.pedido(
	id_pedido INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	id_cliente INT not null references ecommerce.cliente(id_cliente),
	data_pedido DATE not null,
	valor_total NUMERIC(10,4) not null, 
	status TEXT not null
);

CREATE TABLE ecommerce.produto(
	id_produto INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	nome_produto text not null, 
	descricao text not null, 
	preco NUMERIC(10,4) not null, 
	estoque_disponivel INT not null, 
	imagem_url TEXT
);

CREATE TABLE ecommerce.item_pedido(
	id_item INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	id_pedido INT not null references ecommerce.pedido(id_pedido),
	id_produto INT not null references ecommerce.produto(id_produto),
	quantidade INT not null
);

CREATE TABLE ecommerce.pagamento(
	id_pagamento INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	id_pedido INT not null references ecommerce.pedido(id_pedido),
	forma_pagamento TEXT not null, 
	status text not null, 
	data_pagamento TIMESTAMPTZ not null
);
