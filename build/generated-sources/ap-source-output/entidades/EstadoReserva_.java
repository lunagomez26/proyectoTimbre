package entidades;

import entidades.Reserva;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(EstadoReserva.class)
public class EstadoReserva_ { 

    public static volatile SingularAttribute<EstadoReserva, String> nombreEstadoRe;
    public static volatile ListAttribute<EstadoReserva, Reserva> reservaList;
    public static volatile SingularAttribute<EstadoReserva, Integer> idEstadoReserva;
    public static volatile SingularAttribute<EstadoReserva, String> codEstadoRe;

}