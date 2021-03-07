package entidades;

import entidades.Apartamento;
import entidades.Reserva;
import entidades.Solicitud;
import entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:58")
@StaticMetamodel(Residente.class)
public class Residente_ { 

    public static volatile SingularAttribute<Residente, Integer> idResidente;
    public static volatile ListAttribute<Residente, Reserva> reservaList;
    public static volatile SingularAttribute<Residente, Usuario> idUsuario;
    public static volatile SingularAttribute<Residente, Apartamento> idApartamento;
    public static volatile ListAttribute<Residente, Solicitud> solicitudList;

}