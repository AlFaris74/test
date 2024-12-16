package dao.repositories;

import dao.entities.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepos extends JpaRepository<Avion, Long> {

}
