package entidades;

import entidades.RespuestaReserva;
import entidades.Solicitud;
import entidades.Turno;
import entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:58")
@StaticMetamodel(Administrador.class)
public class Administrador_ { 

    public static volatile SingularAttribute<Administrador, Integer> idAdministrador;
    public static volatile SingularAttribute<Administrador, Usuario> idUsuario;
    public static volatile ListAttribute<Administrador, Solicitud> solicitudList;
    public static volatile ListAttribute<Administrador, RespuestaReserva> respuestaReservaList;
    public static volatile SingularAttribute<Administrador, Turno> idTurno;

}