package br.com.matheusvictor.gremio.repository;

import br.com.matheusvictor.gremio.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
