package entidades;

import entidades.Solicitud;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(RespuestaSolicitud.class)
public class RespuestaSolicitud_ { 

    public static volatile SingularAttribute<RespuestaSolicitud, Integer> idRespuestaSolicitud;
    public static volatile SingularAttribute<RespuestaSolicitud, Date> fechaHora;
    public static volatile SingularAttribute<RespuestaSolicitud, String> respuesta;
    public static volatile SingularAttribute<RespuestaSolicitud, Solicitud> idSolicitud;

}