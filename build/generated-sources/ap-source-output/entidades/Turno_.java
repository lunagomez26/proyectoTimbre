package entidades;

import entidades.Administrador;
import entidades.GuardiaDeSeguridad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, String> descripcionTurno;
    public static volatile ListAttribute<Turno, Administrador> administradorList;
    public static volatile ListAttribute<Turno, GuardiaDeSeguridad> guardiaDeSeguridadList;
    public static volatile SingularAttribute<Turno, Date> horaLlegada;
    public static volatile SingularAttribute<Turno, Integer> idTurno;
    public static volatile SingularAttribute<Turno, Date> horaSalida;

}