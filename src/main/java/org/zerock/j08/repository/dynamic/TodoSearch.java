package org.zerock.j08.repository.dynamic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.zerock.j08.entity.Todo;

public interface TodoSearch {

    Todo doA();

    Page<Todo> listWithSearch(String keyword, Pageable pageable);
}
