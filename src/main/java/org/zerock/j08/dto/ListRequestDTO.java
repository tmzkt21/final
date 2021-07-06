package org.zerock.j08.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListRequestDTO {

    @Builder.Default
    private int page = 1;

    @Builder.Default
    private int size = 10;

    private String keyword;

    public void setPage(int page) {

        this.page = page <= 0 ? 1 : page ;
    }

    public void setSize(int size) {

        this.size = size < 10 ? 10 : size;

    }

    @JsonIgnore
    public Pageable getPaeable() {
        return PageRequest.of(this.page -1, this.size);
    }
}












