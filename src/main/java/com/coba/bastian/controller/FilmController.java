package com.coba.bastian.controller;

import com.coba.bastian.dao.FilmDao;
import com.coba.bastian.repository.FilmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;
    @GetMapping("/tug3")
    public List<FilmDao> tug3() {return filmRepository.findAll();}

    @PostMapping("/perintahSave")
    public List<FilmDao> save(@RequestBody FilmDao save) {
        filmRepository.save(save);
        return filmRepository.findAll();
    }

    @PostMapping("/perintahDelete")
    public List<FilmDao> delete(@RequestBody Integer id) {
        filmRepository.deleteById(id);
        return filmRepository.findAll();
    }

    @PostMapping("/perintahCari")
    public FilmDao cari(@RequestBody Integer id) {
        FilmDao response = new FilmDao();
        Optional<FilmDao> dao = filmRepository.findById(id);
        if (dao.isPresent())
            response = dao.get();
        return response;

    }
}
