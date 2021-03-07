package entidades;

import entidades.Reserva;
import entidades.ZonaComunal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:58")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, String> descripcion;
    public static volatile ListAttribute<Evento, Reserva> reservaList;
    public static volatile SingularAttribute<Evento, Date> fechaHora;
    public static volatile SingularAttribute<Evento, Integer> idEvento;
    public static volatile SingularAttribute<Evento, Integer> cantPersonas;
    public static volatile SingularAttribute<Evento, ZonaComunal> idZonaComunal;

}