package ru.yakovlev.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yakovlev.buysell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
