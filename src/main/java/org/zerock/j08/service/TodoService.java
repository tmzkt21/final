package org.zerock.j08.service;

import org.zerock.j08.dto.ListResponseDTO;
import org.zerock.j08.dto.ListRequestDTO;
import org.zerock.j08.dto.TodoDTO;
import org.zerock.j08.entity.Todo;

public interface TodoService {

    ListResponseDTO<TodoDTO> list(ListRequestDTO dto);

    Long register(TodoDTO dto);

    TodoDTO read(Long tno);

    default TodoDTO entityToDTO(Todo entity){
        return TodoDTO.builder()
                .tno(entity.getTno())
                .content(entity.getContent())
                .del(entity.isDel())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();
    }

    default Todo dtoToEntity(TodoDTO dto){

        return Todo.builder()
                .tno(dto.getTno())
                .content(dto.getContent())
                .del(dto.isDel())
                .build();
    }

    Long remove(Long tno);

    TodoDTO modify(TodoDTO todoDTO);
}
