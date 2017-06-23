
private String codigo     ;
private String paterno    ;
private String materno    ;
private String nombre     ;
private String ciudad     ;
private String direccion  ;
private String usuario    ;

select 
chr_emplcodigo     codigo,
vch_emplpaterno    paterno,
vch_emplmaterno    materno,
vch_emplnombre     nombre,
vch_emplciudad     ciudad,
vch_empldireccion  direccion
from usuario 
where vch_emplusuario = ?
and vch_emplclave = ?

codigo
paterno
materno
nombre
ciudad
direccion
usuario
clave



