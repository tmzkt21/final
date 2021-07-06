package org.zerock.j08.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zerock.j08.dto.BoardDTO;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListBoardDTO {

    private BoardDTO boardDTO;
    private long likeCount;
    private long replyCount;
}
