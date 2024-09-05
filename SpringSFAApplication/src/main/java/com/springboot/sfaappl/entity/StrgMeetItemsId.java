package com.springboot.sfaappl.entity;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StrgMeetItemsId implements Serializable{

	private Long tranId;
    private Integer lineNo;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrgMeetItemsId that = (StrgMeetItemsId) o;
        return Objects.equals(tranId, that.tranId) &&
               Objects.equals(lineNo, that.lineNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranId, lineNo);
    }
    
}
