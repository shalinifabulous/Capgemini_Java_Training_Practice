package capgi.com.repository;

import capgi.com.entity.Panda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PandaRepository extends JpaRepository<Panda,Integer> {


}
