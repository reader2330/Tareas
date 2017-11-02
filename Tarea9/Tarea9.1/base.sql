create database tarea9;

use tarea9;


create table usuarios(
id_usuario int,
nombre varchar(30),
apelldo_paterno varchar(30),
apellido_materno varchar(30),
edad int,
primary key(id_usuario)
);




select * from usuarios;

insert into usuarios values(1,"prueba","tarea","jueves",9);
