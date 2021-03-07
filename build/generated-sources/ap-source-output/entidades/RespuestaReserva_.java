package entidades;

import entidades.Administrador;
import entidades.Reserva;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:58")
@StaticMetamodel(RespuestaReserva.class)
public class RespuestaReserva_ { 

    public static volatile SingularAttribute<RespuestaReserva, Administrador> idAdministrador;
    public static volatile SingularAttribute<RespuestaReserva, Date> fechaHora;
    public static volatile SingularAttribute<RespuestaReserva, Integer> idRespuestaReserva;
    public static volatile SingularAttribute<RespuestaReserva, String> respuesta;
    public static volatile SingularAttribute<RespuestaReserva, Reserva> idReserva;

}