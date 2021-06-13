package com.profileScraper.Entities;

public class LeetCodeProfile {

	public String username;
	public String ranking;
	public String contestRating;
	public String contributions;
	public String solvedForAllTime;
	public String solvedForLastYear;
	public String solvedForLastMonth;
	public String inARowMax;
	public String inARowLastYear;
	public String inARowLastMonth;
	
	
	
	
	public LeetCodeProfile() {
		super();
	}




	public LeetCodeProfile(String username,String ranking, String contestRating, String contributions, String solvedForAllTime,
			String solvedForLastYear, String solvedForLastMonth, String inARowMax, String inARowLastYear,
			String inARowLastMonth) {
		super();
		this.username = username;
		this.ranking = ranking;
		this.contestRating = contestRating;
		this.contributions = contributions;
		this.solvedForAllTime = solvedForAllTime;
		this.solvedForLastYear = solvedForLastYear;
		this.solvedForLastMonth = solvedForLastMonth;
		this.inARowMax = inARowMax;
		this.inARowLastYear = inARowLastYear;
		this.inARowLastMonth = inARowLastMonth;
	}




	
	
	
	
}
