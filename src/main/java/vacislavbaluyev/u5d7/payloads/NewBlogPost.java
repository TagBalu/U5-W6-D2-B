package vacislavbaluyev.u5d7.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class NewBlogPost {
    private UUID id;
    private String categoria;
    private String titolo;
    private String imgURL;
    private String contenuto;
    private int tempoDiLettura;
}
