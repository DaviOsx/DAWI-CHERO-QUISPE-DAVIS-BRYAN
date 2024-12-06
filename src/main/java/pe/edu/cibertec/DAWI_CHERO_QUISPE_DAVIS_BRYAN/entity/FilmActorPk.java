package pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS_BRYAN.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmActorPk {
    private Integer filmId;
    private Integer actorId;
}
