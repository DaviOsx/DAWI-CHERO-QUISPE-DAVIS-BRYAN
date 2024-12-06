package pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS_BRYAN.dto;

import java.util.Date;

public record FilmCreateDto(String title, String description, Integer releaseYear, Integer languageId, String languageName, Integer rentalDuration, Double rentalRate, Integer length, Double replacementCost, String rating, String specialFeatures, Date lastUpdate
) {
}
