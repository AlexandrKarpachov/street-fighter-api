package ua.karpachov.street_fighter.dao;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.karpachov.street_fighter.domain.Fighter;

import java.util.Optional;

/**
 * @author Aleksandr Karpachov
 * @version 1.0
 * @since 14.05.2020
 */
@Repository
public interface FighterRepository extends CrudRepository<Fighter, Integer> {
    Optional<Fighter> findByName(String name);

    Iterable<Fighter> findAll(Sort sort);
}
