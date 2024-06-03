show tables;
show triggers;
select* from marca;
describe codiMarca;

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
    DELETE FROM codiMarca WHERE id = OLD.id_marca; 
END // 
DELIMITER ; 