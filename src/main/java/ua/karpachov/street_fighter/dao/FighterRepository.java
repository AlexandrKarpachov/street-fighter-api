package ua.karpachov.street_fighter.dao;

import org.springframework.data.repository.CrudRepository;
import ua.karpachov.street_fighter.domain.Fighter;

/**
 * @author Aleksandr Karpachov
 * @version 1.0
 * @since 14.05.2020
 */

public interface FighterRepository extends CrudRepository<Fighter, Integer> {
}
