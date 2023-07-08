/* Manos a la obra 
Act 6 
a)tabla personajes*/
select * from personajes;

/*b)Muestre solo los nombre_real de la tabla personajes*/
select nombre_real from personajes;

/*c)Muestre solo los nombre que empiezan con b */
select nombre_real from personajes  where nombre_real like 'b%' ;

/* act 7
Ordenas los registros por la columna "inteligencia"*/
select *  from personajes order by inteligencia asc;


