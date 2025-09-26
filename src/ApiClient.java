import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Handler;

public class ApiClient {
    private final HttpClient client= HttpClient.newHttpClient();

    public String fetcQuestion(int amount, String difficulty, String type){
//      https://opentdb.com/api.php?amount=5&difficulty=easy&type=multiple
        String url ="https://opentdb.com/api.php?amount"+amount +"&difficulty"+difficulty+"&type"+type;
        HttpRequest request=HttpRequest.newBuilder()
                .header("Content-Type", "application/json")
                .uri(java.net.URI.create(url))
                .GET()
                .build();
        HttpResponse<String> response;
        try{
            response= client.send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException |InterruptedException e){
        return"error"+e.getMessage();

         }return response.body();


    }

}
