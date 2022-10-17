package p.domain;

import p.B2Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="A2_table")
@Data

public class A2  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;


    public static A2Repository repository(){
        A2Repository a2Repository = B2Application.applicationContext.getBean(A2Repository.class);
        return a2Repository;
    }






}
