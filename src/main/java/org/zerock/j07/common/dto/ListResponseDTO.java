package org.zerock.j07.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zerock.j07.todo.dto.ListRequestDTO;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListResponseDTO<DTO> {

    private ListRequestDTO listRequestDTO;

    private List<DTO> dtoList;

    private PageMaker pageMaker;

}
