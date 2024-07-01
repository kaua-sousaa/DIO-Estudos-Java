package dio.aula_spring_jpa.repository;

import dio.aula_spring_jpa.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<AppUser, Integer> {
    //Query method
    List<AppUser> findByNameContaining(String nome);

    //Query method
    AppUser findByUsername(String username);

    //Query Override
    @Query("Select u from AppUser u WHERE u.name LIKE %:name%")
    List<AppUser> filtrarPorNome(@Param("name") String nome);
}
