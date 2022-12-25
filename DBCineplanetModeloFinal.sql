/* Crear base de datos.*/
create database sistemaCP;

/* Usar base de datos.*/
use sistemaCP;

/* Crear tablas.*/
create table clienteCP(
id_cli int(4) primary key,
nombre_cli varchar(30) not null,
apellidos_cli varchar(30) not null,
dni_cli int(8) not null,
email_cli varchar(50)
);
create table productosCP(
id_producto int(4) primary key,
nombre_pro varchar(30) not null,
precio_pro float not null,
descripcion varchar(100),
nom_categoria varchar(30) not null
);
create table personalCP(
id_per varchar(20) primary key,
nombre_per varchar(30) not null,
apellidos_per varchar(30) not null,
dni_per int(8) not null,
cel_per int(9),
email_per varchar(50),
contraseña varchar(20) not null
);
create table pedidocp(
id_pedido varchar(30) primary key,
fecha_ped date not null,
importe float not null,
total float not null,
resto float not null,
id_per varchar(20) not null,
id_cli int(4) not null
);
create table inventariocp(
nom_categoria varchar(30) primary key,
stock_inv int(3) not null
);
create table productoseleccion(
id_seleccion int primary key auto_increment,
precio float,
id_producto int(4) not null,
id_pedido varchar(30) not null
);

/* Crear claves foraneas. */
alter table pedidocp
add constraint fk_ped_cli foreign key (id_cli)
references clientecp (id_cli)
on delete cascade
on update cascade;

alter table pedidocp
add constraint fk_ped_per foreign key (id_per)
references personalcp (id_per)
on delete cascade	
on update cascade;

alter table productoscp
add constraint fk_pro_inv foreign key (nom_categoria)
references inventariocp (nom_categoria)
on delete cascade
on update cascade;

alter table productoseleccion
add constraint fk_sel_pro foreign key (id_producto)
references productoscp (id_producto)
on delete cascade
on update cascade;

alter table productoseleccion
add constraint fk_ped_sel foreign key (id_pedido)
references pedidocp (id_pedido)
on delete cascade
on update cascade; 

/* Insertar Valores*/
INSERT INTO personalcp (id_per, nombre_per, apellidos_per, dni_per, cel_per, email_per, contraseña) 
VALUES ('ErickCarrillo', 'Erick', 'Carrillo', '74279271', '913223450', 'erickcarrillo2603@gmail.com', 'ErickCarrillo123'),
('EdilsonJMT', 'Jair', 'Muñico', '72403649', '933448023', 'edilsonjmt@gmail.com', 'iron17zx'),
('AdrianSotomayor', 'Adrian', 'Sotomayor', '77075805', '954128468', 'adriansotomayor@gmail.com', 'AdrianSotomayor123');

INSERT INTO inventariocp (nom_categoria, stock_inv) 
VALUES ('Canchita', '300'),
('Combo', '300'),
('Bebida', '300'),
('Especiales', '300');

INSERT INTO productoscp (id_producto, nombre_pro, precio_pro, descripcion, nom_categoria) 
VALUES ('1000', 'C-Mediana','14', 'Canchita tamaño mediano', 'Canchita'),
('1001', 'C-Mediana Dulce','16', 'Canchita dulce, tamaño mediano ', 'Canchita'),
('1002', 'C-Grande','17', 'Canchita tamaño grande ', 'Canchita'),
('1003', 'C-Grande Dulce','20', 'Canchita dulce, tamaño grande ', 'Canchita'),
('1004', 'C-Gigante','22', 'Canchita tamaño gigante ', 'Canchita'),
('1005', 'C-Gigante Dulce','26', 'Canchita dulce, tamaño gigante ', 'Canchita'),
('1006', 'C-Gigante Mix','26', 'Canchita mixta, tamaño gigante ', 'Canchita'),
('1007', 'Combo 1 OL CC','22', 'Canchita Grande(Salada) + 1 Bebida(32oz)', 'Combo'),
('1008', 'Combo 1 OL CC Dulce','25', 'Canchita Grande(Dulce) + 1 Bebida(32oz)', 'Combo'),
('1009', 'Combo de Película OL CC','27', '1 Canchita Grande (Salada) + 2 Bebidas Medianas(21oz).', 'Combo'),
('1010', 'Combo de Película OL CC Dulce','30', '1 Canchita Grande (Dulce) + 2 Bebidas Medianas(21oz).', 'Combo'),
('1011', 'Combo 2 Salado OL CC','37', 'Canchita Gigante (Salada) + 2 Bebidas(32oz)/canchita sin refill', 'Combo'),
('1012', 'Combo 2 Dulce OL CC','41', '1 Canchita Gigante (Dulce) + 2 Bebidas(32oz)/canchita sin refill', 'Combo'),
('1013', 'Combo 2 Mix OL CC','41', '1 Canchita Gigante (Mix) + 2 Bebidas(32oz)/canchita sin refill', 'Combo'),
('1014', 'Com.2 Salado Dob.Gig. OL','48', '2 Canchita Gigante Salada + 2 Bebidas Grandes(32oz)/canchita sin refill', 'Combo'),
('1015', 'Com.2 Dulce Dob.Gig. OL','52', '2 Canchita Gigantclientecpe (Dulce) + 2 Bebidas Grandes (32oz)/canchita sin refill', 'Combo'),
('1016', 'Com.2 Mix Dob.Gig. OL','52', '2 Canchita Gigante + 2 Bebidas Grandes (32oz)', 'Combo'),
('1017', 'CCBebida Mediana OL','12', 'Bebida de 21oz', 'Bebida'),
('1018', 'CCBebida Grande OL','14', 'Bebida de 32oz', 'Bebida'),
('1019', 'Agua San Luis sin gas','5', 'Bebida de 500ml', 'Bebida'),
('1020', 'Nachos','13', 'Nachos con salsa de queso caliente', 'Especiales'),
('1021', 'Hot Dog Jumbo','13', 'Hot Dog con papas al hilo y salsas', 'Especiales');

INSERT INTO clientecp (id_cli, nombre_cli, apellidos_cli, dni_cli, email_cli)
VALUE ('1000', 'No', 'Registrado', '0', '');

SELECT * FROM personalcp;
SELECT * FROM inventariocp;
SELECT * FROM productoscp;
SELECT * FROM clientecp;
SELECT * FROM pedidocp;
SELECT * FROM productoseleccion;

