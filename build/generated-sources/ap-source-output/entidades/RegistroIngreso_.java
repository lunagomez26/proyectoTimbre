package entidades;

import entidades.Apartamento;
import entidades.Correspondencia;
import entidades.GuardiaDeSeguridad;
import entidades.Visitante;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:58")
@StaticMetamodel(RegistroIngreso.class)
public class RegistroIngreso_ { 

    public static volatile ListAttribute<RegistroIngreso, Correspondencia> correspondenciaList;
    public static volatile ListAttribute<RegistroIngreso, Visitante> visitanteList;
    public static volatile SingularAttribute<RegistroIngreso, GuardiaDeSeguridad> idGuardia;
    public static volatile SingularAttribute<RegistroIngreso, Apartamento> idApartamento;
    public static volatile SingularAttribute<RegistroIngreso, Date> fechaHoraRegistro;
    public static volatile SingularAttribute<RegistroIngreso, Integer> idRegistro;

}