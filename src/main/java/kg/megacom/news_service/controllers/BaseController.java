package kg.megacom.news_service.controllers;

import kg.megacom.news_service.controllers.v1.LanguageController;
import kg.megacom.news_service.controllers.v1.NewsDetailController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseController<S, T>{


    @PostMapping("/save")
    S save(@RequestBody S S);

    @PutMapping("/update")
    S update(@RequestBody S s);

    @GetMapping("/all")
    List<S> findAll();

    @GetMapping("/{id}")
    S findById(@PathVariable T id);

    @GetMapping("/delete/{id}")
    void deleteById(@PathVariable Long id);


}
