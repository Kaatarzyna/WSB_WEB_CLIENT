package wsb.webclient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class CatFact {

    FactStatus status;
    String type;
    Boolean deleted;
    String _id;
    Integer __v;
    String text;
    String api;
    Date updatedAt;
    Date createdAt;
    Boolean used;
    String user;

}


