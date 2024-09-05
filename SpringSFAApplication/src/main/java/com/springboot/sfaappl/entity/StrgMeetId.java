package com.springboot.sfaappl.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class StrgMeetId implements Serializable{

	private Long tranId;
	private LocalDate meetLineNo;
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrgMeetId that = (StrgMeetId) o;
        return Objects.equals(tranId, that.tranId) &&
               Objects.equals(meetLineNo, that.meetLineNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranId, meetLineNo);
    }
	 
}
