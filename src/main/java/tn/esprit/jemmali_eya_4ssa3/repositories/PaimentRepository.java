package tn.esprit.jemmali_eya_4ssa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.jemmali_eya_4ssa3.entities.Paiement;

public interface PaimentRepository extends JpaRepository<Paiement, Long> {
}
