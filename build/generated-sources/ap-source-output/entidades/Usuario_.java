package entidades;

import entidades.Administrador;
import entidades.GuardiaDeSeguridad;
import entidades.Mensaje;
import entidades.Residente;
import entidades.Rol;
import entidades.TipoDeDocumento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:58")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> segundoNombre;
    public static volatile SingularAttribute<Usuario, Rol> idRol;
    public static volatile ListAttribute<Usuario, Administrador> administradorList;
    public static volatile ListAttribute<Usuario, GuardiaDeSeguridad> guardiaDeSeguridadList;
    public static volatile SingularAttribute<Usuario, String> primerNombre;
    public static volatile SingularAttribute<Usuario, String> primerApellido;
    public static volatile SingularAttribute<Usuario, Short> isActivo;
    public static volatile ListAttribute<Usuario, Mensaje> mensajeList;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> segundoApellido;
    public static volatile SingularAttribute<Usuario, String> documento;
    public static volatile SingularAttribute<Usuario, TipoDeDocumento> tipoDocumento;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, String> telefono;
    public static volatile ListAttribute<Usuario, Residente> residenteList;

}