package entidades;

import entidades.Solicitud;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(TipoSolicitud.class)
public class TipoSolicitud_ { 

    public static volatile SingularAttribute<TipoSolicitud, Integer> idTipoSolicitud;
    public static volatile SingularAttribute<TipoSolicitud, String> nombreTipoSol;
    public static volatile SingularAttribute<TipoSolicitud, String> codTipoSol;
    public static volatile ListAttribute<TipoSolicitud, Solicitud> solicitudList;

}