DROP DATABASE IF EXISTS inventario2;
CREATE DATABASE inventario2;

USE inventario2;

-- Create tables --
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `rol` enum('Admin','Empleado') DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
DROP TABLE IF EXISTS bodegaFisica;
CREATE TABLE bodegaFisica (
    bodegaFisicaId INT PRIMARY KEY AUTO_INCREMENT,
    bodegaStock INT DEFAULT NULL
);

DROP TABLE IF EXISTS `producto`;
CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `stock_inicial` int(11) DEFAULT NULL,
  `precio_venta` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_producto`),
    bodegaFisicaId int,
    FOREIGN key (bodegaFisicaId) REFERENCES bodegaFisica(bodegaFisicaId)
);

DROP TABLE IF EXISTS `categoria`;
CREATE TABLE `categoria` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(50) DEFAULT NULL,
  `sub_categoria` varchar(50) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
);

DROP TABLE IF EXISTS `historial`;
CREATE TABLE `historial` (
  `id_historial` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(255) NOT NULL,
  `stock` int(11) NOT NULL,
  `vendido` int(11) NOT NULL,
  `perdido` int(11) NOT NULL,
  `descripcion_perdido` varchar(255) DEFAULT NULL,
  `stock_actual` int(11) NOT NULL,
  `fecha` timestamp NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_historial`)
);

DROP TABLE IF EXISTS `marca`;
CREATE TABLE `marca` (
  `id_marca` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_marca`)
);
DROP TABLE IF EXISTS `codiMarca`;
CREATE TABLE `codiMarca` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_marca` int(11) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `co_marca` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `codiProducto`;
CREATE TABLE `codiProducto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_producto` int(11) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `co_producto` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente (
    cliente_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_completo VARCHAR(50),
    direccion VARCHAR(50),
    telefono VARCHAR(12),
    interes DOUBLE,
    credito_limite INT,
    fecha DATE,
    credito_usado INT
);
DROP TABLE IF EXISTS venta;
CREATE TABLE venta (
    VentaId INT PRIMARY KEY AUTO_INCREMENT,
    DetalleVenta varchar(50),
    precioTotal INT,
    id_producto INT,
    FOREIGN key (id_producto) REFERENCES producto(id_producto)
);
-- Insertar datos
INSERT INTO `users` VALUES
(1,'Admin','Admin','ipchile'),
(2,'Empleado','Empleado','ipchile'),

-- Create triggers --
DELIMITER //
DROP TRIGGER IF EXISTS triggerCodiProdu //
CREATE TRIGGER triggerCodiProdu
AFTER INSERT ON producto
FOR EACH ROW
BEGIN
	INSERT INTO codiProducto (id_producto, nombre, co_producto) values (NEW.id_producto, NEW.nombre, CONCAT(NEW.id_producto, 'PRODUCTO_', NEW.nombre));
	END //
DELIMITER ;

DELIMITER //
DROP TRIGGER IF EXISTS triggerCodiMarca //
CREATE TRIGGER triggerCodiMarca
AFTER INSERT ON marca
FOR EACH ROW
BEGIN
	INSERT INTO codiMarca (id_marca, nombre, co_marca) values (NEW.id_marca, NEW.nombre, CONCAT(NEW.id_marca, 'Marca_', NEW.nombre));
	END //
DELIMITER ;

DELIMITER //

DROP TRIGGER IF EXISTS triggerEliminarProdu //

CREATE TRIGGER triggerEliminarProdu
AFTER DELETE ON producto
FOR EACH ROW
BEGIN
    DELETE FROM codiProducto WHERE id_producto = OLD.id_producto;
END //

DELIMITER ;

DELIMITER //

DROP TRIGGER IF EXISTS triggerEliminarMarca //

CREATE TRIGGER triggerEliminarMarca
AFTER DELETE ON marca
FOR EACH ROW
BEGIN
    DELETE FROM codiMarca WHERE id_marca = OLD.id_marca;
END //

DELIMITER ;

