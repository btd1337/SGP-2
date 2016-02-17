DROP DATABASE IF EXISTS Pizzaria;

CREATE DATABASE Pizzaria;

USE Pizzaria;

CREATE TABLE Mesas(
    Mesa int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Nome varchar(4),
    Total double,
    Entrada date,
    Saida date,
    Ocupado boolean NOT NULL
);

INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);
INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false);


CREATE TABLE Pizzas(
    Pizza varchar(25) NOT NULL PRIMARY KEY,
    P double NOT NULL,
    M double NOT NULL,
    G double NOT NULL,
    Descricao varchar(150)
);

INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza Americana',15.90, 24.90, 27.90);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza de Atum', 15.00, 22.90, 24.90);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza de Bacon', 16.90, 24.90, 29.90);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza de Calabresa', 15.90, 24.90, 27.90);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza de Catupiry', 14.90, 23.90, 26.00);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza de Frango', 14.90, 23.90, 26.00);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza de Lombo', 15.90, 24.90, 27.90);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza de Mussarela', 14.90, 23.90, 26.00);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza Paulista', 16.90, 25.90, 28.50);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza Portuguesa', 15.40, 24.90, 26.50);
INSERT INTO Pizzas(Pizza, P, M, G) VALUES ('Pizza de Quatro Queijos', 14.90, 23.90, 26.50);

CREATE TABLE Extras(
    Produto varchar(25) NOT NULL,
    Descricao  varchar(25) NOT NULL,
    Valor double NOT NULL
);

INSERT INTO Extras(Produto, Descricao, Valor) VALUES ('Coca Cola','600ml', 3.50);
INSERT INTO Extras(Produto, Descricao, Valor) VALUES ('Coca Cola','2L', 6.50);
INSERT INTO Extras(Produto, Descricao, Valor) VALUES ('Guaraná Antártica','600ml', 3.20);
INSERT INTO Extras(Produto, Descricao, Valor) VALUES ('Guaraná Antártica','2L', 6.20);
INSERT INTO Extras(Produto, Descricao, Valor) VALUES ('Suco Del Vale','335ml', 3.85);
INSERT INTO Extras(Produto, Descricao, Valor) VALUES ('Água Mineral', '500ml', 2.00);
INSERT INTO Extras(Produto, Valor)            VALUES ('Chiclete Trident',1.50 );

CREATE TABLE Pedidos(
    id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Mesa int NOT NULL, 
    Nome varchar(25) NOT NULL,
    Descricao varchar(25),
    Qtde int NOT NULL,
    Valor double NOT NULL,
    FOREIGN KEY (Mesa) REFERENCES Mesas(Mesa)
);
