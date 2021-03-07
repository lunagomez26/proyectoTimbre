package entidades;

import entidades.Administrador;
import entidades.Cita;
import entidades.EstadoSolicitud;
import entidades.Residente;
import entidades.RespuestaSolicitud;
import entidades.TipoSolicitud;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile SingularAttribute<Solicitud, Administrador> idAdministrador;
    public static volatile SingularAttribute<Solicitud, TipoSolicitud> idTipoSolicitud;
    public static volatile SingularAttribute<Solicitud, Residente> idResidente;
    public static volatile SingularAttribute<Solicitud, Date> fechaHora;
    public static volatile SingularAttribute<Solicitud, String> descirpcion;
    public static volatile SingularAttribute<Solicitud, Integer> idSolicitud;
    public static volatile ListAttribute<Solicitud, RespuestaSolicitud> respuestaSolicitudList;
    public static volatile ListAttribute<Solicitud, Cita> citaList;
    public static volatile SingularAttribute<Solicitud, EstadoSolicitud> idEstadoSolicitud;

}