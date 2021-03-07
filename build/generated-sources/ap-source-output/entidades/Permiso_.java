package entidades;

import entidades.PermisoRol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(Permiso.class)
public class Permiso_ { 

    public static volatile SingularAttribute<Permiso, String> codPermiso;
    public static volatile SingularAttribute<Permiso, Integer> idPermiso;
    public static volatile SingularAttribute<Permiso, String> nombrePermiso;
    public static volatile ListAttribute<Permiso, PermisoRol> permisoRolList;

}