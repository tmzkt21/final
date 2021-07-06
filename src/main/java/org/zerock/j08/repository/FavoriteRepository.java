package org.zerock.j08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.j08.entity.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite,Long> {
}
