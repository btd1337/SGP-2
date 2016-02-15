DROP DATABASE IF EXISTS Pizzaria;

CREATE DATABASE Pizzaria;

USE Pizzaria;

CREATE TABLE Mesas(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome varchar(4),
    totalPagar double,
    horarioEntrada date,
    horarioSaida date,
    ocupacao boolean NOT NULL
);

INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);
INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);
INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);
INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);
INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);
INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);
INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);
INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);
INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);
INSERT INTO Mesas(nome,ocupacao) VALUES('Mesa',false);


CREATE TABLE Pizzas(
    nome varchar(25) NOT NULL PRIMARY KEY,
    P double NOT NULL,
    M double NOT NULL,
    G double NOT NULL,
    descricao varchar(150)
);

INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza Americana',15.90, 24.90, 27.90);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza de Atum', 15.00, 22.90, 24.90);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza de Bacon', 16.90, 24.90, 29.90);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza de Calabresa', 15.90, 24.90, 27.90);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza de Catupiry', 14.90, 23.90, 26.00);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza de Frango', 14.90, 23.90, 26.00);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza de Lombo', 15.90, 24.90, 27.90);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza de Mussarela', 14.90, 23.90, 26.00);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza Paulista', 16.90, 25.90, 28.50);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza Portuguesa', 15.40, 24.90, 26.50);
INSERT INTO Pizzas(nome, P, M, G) VALUES ('Pizza de Quatro Queijos', 14.90, 23.90, 26.50);

CREATE TABLE Produtos(
    nome varchar(25) NOT NULL,
    descricao  varchar(25) NOT NULL,
    valor double NOT NULL
);

INSERT INTO Produtos(nome, descricao, valor) VALUES ('Coca Cola','600ml', 3.50);
INSERT INTO Produtos(nome, descricao, valor) VALUES ('Coca Cola','2L', 6.50);
INSERT INTO Produtos(nome, descricao, valor) VALUES ('Guaraná Antártica','600ml', 3.20);
INSERT INTO Produtos(nome, descricao, valor) VALUES ('Guaraná Antártica','2L', 6.20);
INSERT INTO Produtos(nome, descricao, valor) VALUES ('Suco Del Vale','335ml', 3.85);
INSERT INTO Produtos(nome, descricao, valor) VALUES ('Água Mineral', '500ml', 2.00);
INSERT INTO Produtos(nome, valor)            VALUES ('Chiclete Trident',1.50 );

CREATE TABLE PedidosMesa1(
    id int AUTO_INCREMENT NOT NULL PRIMARY KEY, 
    nome varchar(25) NOT NULL,
    descricao varchar(25),
    qtde int NOT NULL,
    valor double NOT NULL
);
