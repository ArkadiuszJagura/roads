package pl.training.backend.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pl.training.backend.data.entity.Road;



import java.util.Optional;


public interface RoadsRepository extends JpaRepository<Road, Long> {

    Optional <Road> getByMaterialNawierzchni (String materialNawierzchni);

    @Transactional
    @Query("select u from Road u where u.materialNawierzchni = :materialNawierzchni")
    void selectByMaterialNawierzchni(@Param("materialNawierzchni") String materialNawierzchni);

}
