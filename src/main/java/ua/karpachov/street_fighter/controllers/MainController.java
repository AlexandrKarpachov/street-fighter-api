package ua.karpachov.street_fighter.controllers;

import org.springframework.web.bind.annotation.*;
import ua.karpachov.street_fighter.dao.FighterRepository;
import ua.karpachov.street_fighter.domain.Fighter;


/**
 * @author Aleksandr Karpachov
 * @version 1.0
 * @since 14.05.2020
 */
@RestController
public class MainController {

    private final FighterRepository fighterRepository;

    public MainController(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }

    @GetMapping("/get_fighters")
    public Iterable<Fighter> greeting() {
        return this.fighterRepository.findAll();
    }

    @GetMapping("/increase_wr")
    public Fighter incrementWinRate(String name) {
        Fighter fighter = fighterRepository.findByName(name).orElse(new Fighter(name));
        fighter.incrementWinRate();
        this.fighterRepository.save(fighter);
        return fighter;
    }
}
