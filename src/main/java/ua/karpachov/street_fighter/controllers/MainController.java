package ua.karpachov.street_fighter.controllers;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import ua.karpachov.street_fighter.dao.FighterRepository;
import ua.karpachov.street_fighter.domain.Fighter;


/**
 * @author Aleksandr Karpachov
 * @version 1.0
 * @since 14.05.2020
 */
@CrossOrigin
@RestController
public class MainController {

    private final FighterRepository fighterRepository;

    public MainController(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }

    @GetMapping("/get_fighters")
    public Iterable<Fighter> greeting() {
        return this.fighterRepository.findAll(Sort.by(Sort.Direction.DESC, "wins"));
    }

    @PostMapping("/increase_wr")
    public Fighter incrementWinRate(@RequestBody String name) {
        name = name.substring(1, name.lastIndexOf('\"'));
        Fighter fighter = fighterRepository.findByName(name).orElse(new Fighter(name));
        fighter.incrementWinRate();
        this.fighterRepository.save(fighter);
        return fighter;
    }
}
