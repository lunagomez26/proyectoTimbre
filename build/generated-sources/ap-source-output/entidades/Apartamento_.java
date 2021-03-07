package entidades;

import entidades.RegistroIngreso;
import entidades.Residente;
import entidades.Torre;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-26T18:47:58")
@StaticMetamodel(Apartamento.class)
public class Apartamento_ { 

    public static volatile SingularAttribute<Apartamento, Integer> idApartamento;
    public static volatile SingularAttribute<Apartamento, Torre> idTorre;
    public static volatile ListAttribute<Apartamento, Residente> residenteList;
    public static volatile ListAttribute<Apartamento, RegistroIngreso> registroIngresoList;
    public static volatile SingularAttribute<Apartamento, String> placa;
    public static volatile SingularAttribute<Apartamento, Integer> datafono;

}