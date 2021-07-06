package org.zerock.j08.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.zerock.j08.repository.BoardRepository;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public void getList() {

        Pageable pageable = PageRequest.of(0,10);

        Page<Object[]> result = boardRepository.getData1(pageable);

        log.info(result);

    }
}
