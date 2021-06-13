package com.profileScraper.Scrapers;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.profileScraper.Entities.CodeChefProfile;

public class CodeChefScraper {
	
	public CodeChefProfile codeChefProfileProvider(String username) throws Exception {
		
		CodeChefProfile newUser = new CodeChefProfile();	
		
		Document doc = documentProvider(username);
		if(doc.baseUri().equals("https://www.codechef.com"))
		{
			throw new Exception("wrong User Id");
		}
		
		newUser.username =fullNameProvider(doc);
		newUser.institution = institutionProvider(doc);
		newUser.country = countryProvider(doc);
		newUser.state = stateProvider(doc);
		newUser.presentCodeChefRating = codechefratingprovider(doc);
		newUser.highestCodeChefRating = highestRatingProvider(doc);
		newUser.longChallengeRating = longChallengeRatingProvider(doc);
		newUser.cookOffRating = cookOffRatingProvider(doc);
		newUser.lunchTimeRating = lunchTimeRatingProvider(doc);
		newUser.fullySolvedQuestions = fullySolvedProblems(doc);
		newUser.partiallySolvedQuestions = partiallySolvedProblems(doc);
		newUser.numberOfContestParticipated = contestNumber(doc);
		return newUser;
		
	}
	
	private int contestNumber(Document doc) {
		int count = 0;
		try {
			Element element = doc.select("section.problems-solved article").get(0);
			Elements elements = element.select("p");
			Element element1;
			Elements elements1 = null;
			try {
				element1 = doc.select("section.problems-solved article").get(1);
				elements1 = element.select("p");
			}catch(Exception e) {
				return elements.size();	
			}
			
			
			
			count = countUnique(elements,elements1);
		}catch(Exception e) {
			return 0;
		}
		return count;
	}

	private int countUnique(Elements elements, Elements elements1) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		for(Element ele:elements) {
			list.add(ele.html());
		}
		for(Element ele:elements1) {
			list1.add(ele.html());
		}
		if(list.size()==0||list1.size()==0) {
			return list.size()+list1.size();
		}
		for(String ele:list1) {
			if(!list.contains(ele)) {
				list.add(ele);
			}
		}
		return list.size();
	}

	private int partiallySolvedProblems(Document doc) {
		Element element ;
		Elements elements;
		int count = 0;
		try {
			 element = doc.select("section.problems-solved article").get(1);
			 elements = element.select("p");
			// System.out.println(elements.size());
				
				for(Element ele :elements) {
					for(Element ele1:ele.select("span a")) {
						//System.out.println(ele1.html());
						count++;
					}
				}
		}catch(Exception e) {
			return 0;
		}
		
		
		return count;
	}

	private int fullySolvedProblems(Document doc) {
		// TODO Auto-generated method stub
		int count = 0;
		try {
			Element element = doc.select("section.problems-solved article").get(0);
			Elements elements = element.select("p");
			
			for(Element ele :elements) {
				for(Element ele1:ele.select("span a")) {
					//System.out.println(ele1.html());
					count++;
				}
			}
		}catch(Exception e) {
			return 0;
		}
		return count;
	}

	private String lunchTimeRatingProvider(Document doc) {
		Element ratingFirstTR = doc.select("table.rating-table tbody tr").get(2);
		Element secondTD = ratingFirstTR.select("td").get(1);
		return secondTD.html();
	}

	private String cookOffRatingProvider(Document doc) {
		Element ratingFirstTR = doc.select("table.rating-table tbody tr").get(1);
		Element secondTD = ratingFirstTR.select("td").get(1);
		return secondTD.html();
	}

	private String longChallengeRatingProvider(Document doc) {
		Element ratingFirstTR = doc.select("table.rating-table tbody tr").get(0);
		Element secondTD = ratingFirstTR.select("td").get(1);
		return secondTD.html();
	}

	private String highestRatingProvider(Document doc) {
		Elements highestRatingElement = doc.select("div.rating-header small");
		System.out.println("the highest rating is"+highestRatingElement.html());
		return highestRatingElement.html();
	}

	private String codechefratingprovider(Document doc) {
		Elements element = doc.select("div.rating-number");
		return element.html();
		
	}

	private String stateProvider(Document doc) {
		Element element = doc.select("section.user-details ul li").get(2);
		Elements institutionName = element.select("span");
		System.out.println(institutionName.html());
		return institutionName.html();
	}

	private String countryProvider(Document doc) {
		Element element = doc.select("section.user-details ul li").get(1);
		Elements institutionName = element.select("span span");
		System.out.println(institutionName.html());
		return institutionName.html();
	}

	private String institutionProvider(Document doc) {
		// TODO Auto-generated method stub
		Element element = doc.select("section.user-details ul li").get(5);
		Elements institutionName = element.select("span");
		System.out.println(institutionName.html());
		return institutionName.html();
	}

	private String fullNameProvider(Document doc) {
		Elements element = doc.select("div.user-details-container header h2");
		String fullName = element.html();
		return fullName;
	}

	private Document documentProvider(String user) throws IOException {
		Document doc = Jsoup.connect("https://www.codechef.com/users/"+user).get();
		return doc;
	}

}
