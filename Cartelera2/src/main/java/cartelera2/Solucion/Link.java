package cartelera2.Solucion;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URI;

public class Link extends Mensaje{

    private URL link;

    public Link(String mensaje) throws URISyntaxException, MalformedURLException {
        super(mensaje);
        URI uri = new URI(mensaje);
        link = uri.toURL();
    }

    public URL getLink(){
        return link;
    }
}
