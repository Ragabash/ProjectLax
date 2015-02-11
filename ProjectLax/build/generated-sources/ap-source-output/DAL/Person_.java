package DAL;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-01-14T16:14:06")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile SingularAttribute<Person, Date> birthday;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile SingularAttribute<Person, Boolean> gender;
    public static volatile SingularAttribute<Person, String> country;

}