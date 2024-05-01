package ua.oneman.catalogservice.DTO;

import org.antlr.v4.runtime.misc.NotNull;

public class PhotoDTO {

    @NotNull
    int Id;

    @NotNull
    int product_id;

    @NotNull
    String photoURL;
}
