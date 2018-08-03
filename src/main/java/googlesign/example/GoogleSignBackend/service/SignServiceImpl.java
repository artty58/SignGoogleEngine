package googlesign.example.GoogleSignBackend.service;
import googlesign.example.GoogleSignBackend.entity.Sign;
import googlesign.example.GoogleSignBackend.repository.SignRepository;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.JSONObject;

import java.util.List;


@Service
    public class SignServiceImpl implements SignService {

    @Autowired
    SignRepository signRepository;


    @Override
    public void save(String json) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);

        Sign sign = new Sign();
        sign.setUserName(jsonObject.getString("User"));
        sign.setPassword(jsonObject.getString("Pass"));
        sign.setFirstName(jsonObject.getString("FName"));
        sign.setLastName(jsonObject.getString("LName"));
        sign.setTelePhone(jsonObject.getString("Tel"));
        sign.setAddress(jsonObject.getString("Add"));
        signRepository.save(sign);

    }

    @Override
    public List<Sign> getUser(String json) {
         return signRepository.findByUser(json);
    }
}



