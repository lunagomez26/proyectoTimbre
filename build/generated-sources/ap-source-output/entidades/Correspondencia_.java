package entidades;

import entidades.Papeleria;
import entidades.Paqueteria;
import entidades.RegistroIngreso;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:58")
@StaticMetamodel(Correspondencia.class)
public class Correspondencia_ { 

    public static volatile SingularAttribute<Correspondencia, String> descripcion;
    public static volatile ListAttribute<Correspondencia, Papeleria> papeleriaList;
    public static volatile SingularAttribute<Correspondencia, String> remitente;
    public static volatile ListAttribute<Correspondencia, Paqueteria> paqueteriaList;
    public static volatile SingularAttribute<Correspondencia, Integer> idCorrespondencia;
    public static volatile SingularAttribute<Correspondencia, Date> fechaHoraEntrega;
    public static volatile SingularAttribute<Correspondencia, RegistroIngreso> idRegistro;

}