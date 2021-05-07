package abstract_factory;

/*
Usamos este paquete para la creacion de enemigos en funcion de la localizacion y el tipo.
Disponemos de EnemyFactory, que se encarga de recoger y determinar los enemigos.
Por cada distinta Localizacion (Calle, Jungla y Playa) disponemos de un EnemigosLocalizacion.
Por ultimo tenemos una interfaz por cada tipo de enemigo (MDLR, Frank y Guiri), de la cual extendera una clase por Localizacion
para determinar asi sus distintas ventajas y desventajas.

Con GameController definimos una serie de Enemigos base que,
mas adelante con los datos de localizacion y tipo de enemigo proporcionados en el main,
igualaremos a su correspondiente "enemigo especializado".

A part, guardamos los tipos de enemigos dependiendo de su localizacion en el paquete "enemys",
para que sea mas sencillo añadir y editar distintos enemigos.

*/