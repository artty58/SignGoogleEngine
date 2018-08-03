package googlesign.example.GoogleSignBackend;


import googlesign.example.GoogleSignBackend.entity.Sign;
import googlesign.example.GoogleSignBackend.repository.SignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSign implements CommandLineRunner {

    @Autowired
    SignRepository signrepository;

    @Override
    public void run(String... string) throws Exception {

        Sign s1 = new Sign();
        s1.setUserName("alongkorn.don@northbkk.ac.th");
        s1.setFirstName("ALONGKORN");
        s1.setLastName("DONSUWAN");
        s1.setPassword("Artty1150");
        s1.setTelePhone("191");
        s1.setAddress("Bankok, Thailand");

        signrepository.saveAndFlush(s1);
    }

}
