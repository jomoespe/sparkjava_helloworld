package es.viajeselcorteingles.devops.helloworld;

import static spark.Spark.port;
import static spark.Spark.get;

public class HelloWorld {
    public static void main(String...args) {
        port(8080);
        
        get("/", (request, response) -> {
            return "Hello World!";
        });
        
        get("/health", (request, response) -> {
            response.header("Content-Type", "application/json");
            return "{" +
                    "\"status\": \"UP\", " +
                    "\"description\": \"VECI Ansible Java role test app\" " +
                    "}";
        });
    }
}
