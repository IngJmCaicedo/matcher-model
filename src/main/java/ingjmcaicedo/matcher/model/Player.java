package ingjmcaicedo.matcher.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Player {

	@Id
	private String id;
	private String document;
	private String name;
	
	private List<Team> teams;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	
}
