package entidades;

import entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(Mensaje.class)
public class Mensaje_ { 

    public static volatile SingularAttribute<Mensaje, String> contenido;
    public static volatile SingularAttribute<Mensaje, Usuario> codUsuario;
    public static volatile SingularAttribute<Mensaje, String> asunto;
    public static volatile SingularAttribute<Mensaje, Integer> codmensaje;
    public static volatile SingularAttribute<Mensaje, String> destinatario;

}