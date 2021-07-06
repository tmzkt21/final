package org.zerock.j08.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
