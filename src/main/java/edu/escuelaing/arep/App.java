package edu.escuelaing.arep;
import org.json.JSONObject;
import static spark.Spark.port;
import static spark.Spark.get;
import spark.Response;
import spark.Request;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Calculadora calculadora = new Calculadora();
	
    public static void main( String[] args )
    {
        port(getPort());
        get("/atan", (req, res) -> inputDataPage(req, res, "atan"));
    }
    
    private static JSONObject inputDataPage(Request req, Response res, String operation)
    {
    	double numero = Double.parseDouble(req.queryParams("value"));
        JSONObject json = new JSONObject();
        json.put("operation",operation);
        json.put("input",numero);
        json.put("output",(operation.equals("atan"))? calculadora.arcoTangente(numero):calculadora.logaritmoNatural(numero));
        return json;
    }
    
    private static int getPort()
    {
    	int puerto = 0;
    	if(System.getenv("PORT") != null) puerto = Integer.parseInt(System.getenv("PORT"));
    	else puerto = 5001;
    	
    	return puerto;
    }
}
