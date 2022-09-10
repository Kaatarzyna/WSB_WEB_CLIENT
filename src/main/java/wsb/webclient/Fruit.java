package wsb.webclient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Fruit {

    String genus;
    String name;
    Integer id;
    String family;
    String order;

    Nutritions nutritions;
}
