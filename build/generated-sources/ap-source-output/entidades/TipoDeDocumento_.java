package entidades;

import entidades.Usuario;
import entidades.Visitante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(TipoDeDocumento.class)
public class TipoDeDocumento_ { 

    public static volatile ListAttribute<TipoDeDocumento, Usuario> usuarioList;
    public static volatile ListAttribute<TipoDeDocumento, Visitante> visitanteList;
    public static volatile SingularAttribute<TipoDeDocumento, String> codTipoDocumento;
    public static volatile SingularAttribute<TipoDeDocumento, Integer> idTipo;
    public static volatile SingularAttribute<TipoDeDocumento, String> nombreTipoDocumento;

}