package ua.karpachov.street_fighter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.karpachov.street_fighter.dao.FighterRepository;
import ua.karpachov.street_fighter.domain.Fighter;

import java.util.List;
import java.util.Optional;

/**
 * @author Aleksandr Karpachov
 * @version 1.0
 * @since 14.05.2020
 */
@RestController
public class MainController {

    @Autowired
    private FighterRepository fighterRepository;

    @GetMapping("/get_fighters")
    public Iterable<Fighter> greeting() {
        return this.fighterRepository.findAll();
    }

    @GetMapping("/increment_wr")
    public Fighter incrementWinRate(@RequestParam Integer id, String name) {
        Fighter fighter = fighterRepository.findById(id).orElse(new Fighter(id, name));
        fighter.incrementWinRate();
        this.fighterRepository.save(fighter);
        return fighter;
    }
}
