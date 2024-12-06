package pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS_BRYAN.service;

import pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS_BRYAN.dto.FilmCreateDto;
import pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS_BRYAN.dto.FilmDetailDto;
import pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS_BRYAN.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

    FilmDetailDto findFilmById(int id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);

    Boolean addFilm(FilmCreateDto filmCreateDto);

    Boolean deleteFilmById(int id);
}
