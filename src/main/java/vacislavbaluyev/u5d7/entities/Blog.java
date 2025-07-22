package vacislavbaluyev.u5d7.entities;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Blog {
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String categoria;
    private String titolo;
    private String imgURL;
    private String contenuto;
    private int tempoDiLettura;


    public Blog(String categoria, String titolo, String imgURL, String contenuto, int tempoDiLettura) {
        this.id = UUID.randomUUID();
        this.categoria = categoria;
        this.titolo = titolo;
        this.imgURL = imgURL;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }
}
