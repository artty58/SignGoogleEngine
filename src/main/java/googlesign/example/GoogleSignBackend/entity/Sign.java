package googlesign.example.GoogleSignBackend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;



    @Data
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of={"id"})

    public class Sign {

        private @Id
        @GeneratedValue(strategy= GenerationType.TABLE)Long id;

        private String userName;
        private String password;
        private String firstName;
        private String lastName;
        private String telePhone;
        private String address;


    }


