package tn.esprit.jemmali_eya_4ssa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.jemmali_eya_4ssa3.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
