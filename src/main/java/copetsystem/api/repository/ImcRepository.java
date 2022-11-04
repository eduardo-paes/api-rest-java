package copetsystem.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import copetsystem.api.model.Imc;

@Repository
public interface ImcRepository  extends JpaRepository  <Imc, Integer> {

}

