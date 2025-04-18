package ru.yakovlev.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yakovlev.buysell.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
