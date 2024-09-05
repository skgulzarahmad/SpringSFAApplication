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
public class StrgSeriesId implements Serializable{

	 private String salesPers;
	 private String custCode;
	 private String itemSer;
	 private Long routeId;
	 
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        StrgSeriesId that = (StrgSeriesId) o;
	        return salesPers.equals(that.salesPers) &&
	               custCode.equals(that.custCode) &&
	               itemSer.equals(that.itemSer) &&
	               routeId.equals(that.routeId);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(salesPers, custCode, itemSer, routeId);
	    }
}
