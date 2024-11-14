use bdproyectoviaje;
DROP PROCEDURE IF EXISTS COD_BOLETO;
CREATE PROCEDURE cliente
Select cod_boleto,nombre,asiento,pago from pasajero;

use bdproyectoviaje ;
drop procedure if EXISTS cod_chofer;
CREATE procedure chof(id char(B001))
Select cod_chofer,nombre,fecha,categoria from chofer;

USE bdproyectoviaje;
DROP PROCEDURE IF EXISTS SPADICION;
DELIMITER @@
CREATE PROCEDURE SPADICION(cod_boleto VARCHAR(30),nombre VARCHAR(30),asiento varchar(3) , pago double(1))
BEGIN
DECLARE CUENTA INT;
DECLARE cod_boleto CHAR(5);
SELECT IFNULL(RIGHT(MAX(cod_boleto),4),0)+1 INTO CUENTA FROM chofer;
SET CODA=CONCAT("A",LPAD(CUENTA,4,"0"));
INSERT INTO pasajero VALUES (cod_boleto,nombre,asiento,pago);
END @@ 

------------------------------
Select cod_boleto,nombre,asiento,pago from pasajero
Select cod_chofer,nombre,fecha,categoria from chofer
Select cod_viaje,fecha,hora,costo from viajes
update pasajero set nombre=?,asiento=?,pago=? where cod_boleto=?
select count(cliente) from cliente  where cliente=?
select ID,cliente,costo , años from cliente  where ID=?
insert into pasajero (cod_boleto,nombre,asiento,pago) values(null,?,?,?)
