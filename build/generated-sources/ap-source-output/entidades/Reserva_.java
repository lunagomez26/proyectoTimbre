package entidades;

import entidades.EstadoReserva;
import entidades.Evento;
import entidades.Residente;
import entidades.RespuestaReserva;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Residente> idResidente;
    public static volatile SingularAttribute<Reserva, Date> fechaHora;
    public static volatile SingularAttribute<Reserva, Evento> idEvento;
    public static volatile SingularAttribute<Reserva, EstadoReserva> idEstadoReserva;
    public static volatile ListAttribute<Reserva, RespuestaReserva> respuestaReservaList;
    public static volatile SingularAttribute<Reserva, Integer> idReserva;

}