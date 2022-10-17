package p.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import p.B2Application;

@Entity
@Table(name = "A23_table")
@Data
public class A23 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static A23Repository repository() {
        A23Repository a23Repository = B2Application.applicationContext.getBean(
            A23Repository.class
        );
        return a23Repository;
    }
}
