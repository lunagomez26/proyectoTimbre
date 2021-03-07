package entidades;

import entidades.RegistroIngreso;
import entidades.TipoDeDocumento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(Visitante.class)
public class Visitante_ { 

    public static volatile SingularAttribute<Visitante, TipoDeDocumento> tipoDocumento;
    public static volatile SingularAttribute<Visitante, String> segundoNombre;
    public static volatile SingularAttribute<Visitante, String> primerNombre;
    public static volatile SingularAttribute<Visitante, String> primerApellido;
    public static volatile SingularAttribute<Visitante, String> segundoApellido;
    public static volatile SingularAttribute<Visitante, String> documento;
    public static volatile SingularAttribute<Visitante, Integer> idVisitante;
    public static volatile SingularAttribute<Visitante, RegistroIngreso> idRegistro;

}