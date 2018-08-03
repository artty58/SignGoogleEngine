package googlesign.example.GoogleSignBackend.controller;

import googlesign.example.GoogleSignBackend.entity.Sign;
import googlesign.example.GoogleSignBackend.repository.SignRepository;
import googlesign.example.GoogleSignBackend.service.SignService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import flexjson.JSONSerializer;

import java.util.List;

@RestController
public class SignController {

    @Autowired
    SignRepository signRepository;

    @Autowired
    SignService signService;

    @PostMapping("/savesign")
    public ResponseEntity<String> save(@RequestBody String json) throws JSONException {

        HttpHeaders header = new HttpHeaders();
        header.add("Context-Type", "application/json;");

        signService.save(json);

        return new ResponseEntity<String>(new JSONSerializer().prettyPrint(true).serialize("SUCCESS"), header, HttpStatus.OK);

    }

    @GetMapping("/findByUser")
    public ResponseEntity<String> findByUser(@RequestParam("email") String email) {
        List<Sign> sign = signService.getUser(email);

        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json;");

        return new ResponseEntity<String>(new JSONSerializer().prettyPrint(true).serialize(sign), header, HttpStatus.OK);
    }
}
