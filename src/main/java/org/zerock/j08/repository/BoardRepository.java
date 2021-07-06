package org.zerock.j08.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zerock.j08.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

    @Query("select b, count(distinct r), count(distinct f) from Board b " +
            "left join Reply r on r.board = b " +
            "left join Favorite f on f.board = b " +
            "group by b order by b.bno desc ")
    Page<Object[]> getData1(Pageable pageable);
}
