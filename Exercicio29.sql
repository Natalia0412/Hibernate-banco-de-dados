CREATE DATABASE EXERCICIO29 
USE EXERCICIO29
CREATE TABLE TB_FUNCIONARIO2
(ID_FUNCIONARIO BIGINT PRIMARY KEY IDENTITY NOT NULL,
TX_NOME  VARCHAR(50) NOT NULL,
TX_FONE VARCHAR(14) NOT NULL,
TP_FUNCIONARIO VARCHAR(10) NOT NULL,
DT_CADASTRO DATE );

alter table TB_FUNCIONARIO
alter column DT_CADASTRO DATE NOT NULL;

SELECT*FROM TB_FUNCIONARIO2;
drop table TB_FUNCIONARIO;