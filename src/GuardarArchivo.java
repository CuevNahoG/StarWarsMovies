import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//Clase para gguardar los datos obtenidos
import java.io.FileWriter;
import java.io.IOException;

public class GuardarArchivo {

    public void guargarJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(pelicula.title()+".json");
        escritura.write(gson.toJson(pelicula));
        escritura.close();
    }
}
