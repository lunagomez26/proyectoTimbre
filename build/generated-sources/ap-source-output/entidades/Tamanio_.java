package entidades;

import entidades.Paqueteria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:57")
@StaticMetamodel(Tamanio.class)
public class Tamanio_ { 

    public static volatile SingularAttribute<Tamanio, Integer> idTamaño;
    public static volatile ListAttribute<Tamanio, Paqueteria> paqueteriaList;
    public static volatile SingularAttribute<Tamanio, String> nombreTamaño;
    public static volatile SingularAttribute<Tamanio, String> codTamaño;

}