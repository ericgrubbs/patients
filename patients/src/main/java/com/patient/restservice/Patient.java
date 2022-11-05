package com.patient.restservice;

public class Patient {

	private final long id;
	private final String content;

	public Patient(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
