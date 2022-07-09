package com.gl.library.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // create table book in h2 database
public class Library {
	@Id
	private long id;
	private String bookname;
	private String bookauthor;
}
