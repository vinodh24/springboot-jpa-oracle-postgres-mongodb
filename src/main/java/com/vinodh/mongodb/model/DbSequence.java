package com.vinodh.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_sequence")
public class DbSequence {
    @Id
    private String id;
    private int seqNo;
	public String getSeqName() {
		return id;
	}
	public void setSeqName(String id) {
		this.id = id;
	}
	public int getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	@Override
	public String toString() {
		return "DbSequence [id=" + id + ", seqNo=" + seqNo + "]";
	}
	
}