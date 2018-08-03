package googlesign.example.GoogleSignBackend.repository;
import  googlesign.example.GoogleSignBackend.entity.Sign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SignRepository extends JpaSpecificationExecutor<Sign>,
        JpaRepository<Sign, Long>,
        PagingAndSortingRepository<Sign, Long> {

    @Query("select g from Sign g where LOWER (g.userName) = concat( lower(:User))")
    List<Sign> findByUser(String User);
//
}
