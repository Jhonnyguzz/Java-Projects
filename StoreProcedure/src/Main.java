
public class Main {

	public static void main(String[] args) {
		
		Store db = new Store();

        String r = db.procedure("John Winston Lennon", 1999);
        System.out.println(r);

        r = db.procedure("James Paul McCartney", 1990);
        System.out.println(r);

        r = db.procedure("Ned Flanders", 1994);
        System.out.println(r);
	}

}

/*
DROP TABLE jugador;

CREATE TABLE jugador (
  id int(2) NOT NULL auto_increment,
  nombre varchar(60) NOT NULL,
  anio_nac int(4) default NULL,
  categoria varchar(20) default NULL,
  PRIMARY KEY  (id)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=15;

DROP PROCEDURE registrar_jugador;

DELIMITER $$
CREATE PROCEDURE registrar_jugador(IN nombre varchar(60) ,
                                   IN anio_nac INT,
                                   OUT resultado TEXT)
BEGIN
DECLARE edad int ;
DECLARE categoria char(20) ;
-- obtiene la edad del jugador
SET edad = ( DATE_FORMAT(now() ,'%Y') - anio_nac );
-- dependiendo de la edad se registra al jugador en diferentes categorias
SELECT @edad;
     CASE
        WHEN edad=18 OR edad=19 OR edad=20 THEN SET categoria = 'Sub 20'  ;
        WHEN edad=21 OR edad=22 OR edad=23 THEN SET categoria = 'Sub 22'  ;
        ELSE SET categoria = 'Sin categoria';
     END CASE ;
     INSERT INTO jugador(nombre, anio_nac, categoria) VALUES( nombre, anio_nac , categoria );
-- Cuando se termina de registrar al jugador, se devuelve una respuesta en formato de texto
     SET resultado = CONCAT( 'Jugador ', nombre, ' de ' , edad , ' años registrado en categoria [' , categoria, ']' );
END;
$$ DELIMITER

*/
