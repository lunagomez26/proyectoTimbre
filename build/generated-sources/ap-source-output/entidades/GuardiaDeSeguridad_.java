package entidades;

import entidades.RegistroIngreso;
import entidades.Turno;
import entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(GuardiaDeSeguridad.class)
public class GuardiaDeSeguridad_ { 

    public static volatile SingularAttribute<GuardiaDeSeguridad, Integer> idGuardia;
    public static volatile SingularAttribute<GuardiaDeSeguridad, Usuario> idUsuario;
    public static volatile ListAttribute<GuardiaDeSeguridad, RegistroIngreso> registroIngresoList;
    public static volatile SingularAttribute<GuardiaDeSeguridad, Turno> idTurno;

}