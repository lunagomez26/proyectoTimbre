package entidades;

import entidades.Solicitud;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(EstadoSolicitud.class)
public class EstadoSolicitud_ { 

    public static volatile SingularAttribute<EstadoSolicitud, String> nombreEstado;
    public static volatile ListAttribute<EstadoSolicitud, Solicitud> solicitudList;
    public static volatile SingularAttribute<EstadoSolicitud, Integer> idEstadoSolicitud;
    public static volatile SingularAttribute<EstadoSolicitud, String> codEstado;

}