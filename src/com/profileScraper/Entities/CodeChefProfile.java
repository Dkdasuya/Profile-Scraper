package com.profileScraper.Entities;

public class CodeChefProfile {

	public String username;
	public String institution;
	public String country;
	public String state;
	public String presentCodeChefRating;
	public String highestCodeChefRating;
	public String longChallengeRating;
	public String cookOffRating;
	public String lunchTimeRating;
	public int fullySolvedQuestions;
	public int partiallySolvedQuestions;
	public int numberOfContestParticipated;
	
	public CodeChefProfile() {
		
	}
	
	public CodeChefProfile(String username, String institution, String country, String state,
			String presentCodeChefRating, String highestCodeChefRating, String longChallengeRating,
			String cookOffRating, String lunchTimeRating, int fullySolvedQuestions, int partiallySolvedQuestions,
			int numberOfContestParticipated) {
		super();
		this.username = username;
		this.institution = institution;
		this.country = country;
		this.state = state;
		this.presentCodeChefRating = presentCodeChefRating;
		this.highestCodeChefRating = highestCodeChefRating;
		this.longChallengeRating = longChallengeRating;
		this.cookOffRating = cookOffRating;
		this.lunchTimeRating = lunchTimeRating;
		this.fullySolvedQuestions = fullySolvedQuestions;
		this.partiallySolvedQuestions = partiallySolvedQuestions;
		this.numberOfContestParticipated = numberOfContestParticipated;
	}
	
}
