package com.gofer.location.esmodel;

import java.util.Iterator;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "region",type = "region")
public class Region {
	@Id
	String regionId;

	Iterator<Position> positionList;
}
