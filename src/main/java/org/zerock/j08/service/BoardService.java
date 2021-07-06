package org.zerock.j08.service;

import org.zerock.j08.dto.BoardDTO;
import org.zerock.j08.dto.ListBoardDTO;
import org.zerock.j08.entity.Board;

public interface BoardService {

    void getList();

    default ListBoardDTO arrToDTO(Object[] arr){

        Board board = (Board)arr[0];
        long replyCount = (long)arr[1];
        long favoriteCount = (long)arr[2];

        return ListBoardDTO.builder()
                .boardDTO(entityToDTO(board))
                .likeCount(favoriteCount)
                .replyCount(replyCount)
                .build();

    }

    default BoardDTO entityToDTO(Board board){
        return BoardDTO.builder()
                .bno(board.getBno())
                .title(board.getTitle())
                .content(board.getContent())
                .writer(board.getWriter())
                .regDate(board.getRegDate())
                .modDate(board.getModDate())
                .build();
    }

}
