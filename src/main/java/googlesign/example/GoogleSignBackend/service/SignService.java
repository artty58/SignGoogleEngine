package googlesign.example.GoogleSignBackend.service;
import java.util.List;
import  googlesign.example.GoogleSignBackend.entity.Sign;
import org.json.JSONException;

public interface SignService {
     void save(String json) throws JSONException;
     List<Sign> getUser(String json);

}
