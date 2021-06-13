package com.profileScraper.Scrapers;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.profileScraper.Entities.CodeChefProfile;
import com.profileScraper.Entities.LeetCodeProfile;

public class LeetCodeScraper {
	
public LeetCodeProfile codeForcesProfileProvider(String user) throws Exception {
		
		LeetCodeProfile newUser = new LeetCodeProfile();	
		
		Document doc = documentProvider(user);
		
		if(doc.baseUri().equals("https://codeforces.com/"))
		{
			throw new Exception("wrong User Id");
		}
		
		newUser.username = user;
		newUser.contestRating = getContestRating(doc);
		newUser.ranking = getRanking(doc);
		
		fillTheSixFields(doc,newUser);
		getContributions(doc,newUser);
		
		return newUser;
		
	}

private void getContributions(Document doc, LeetCodeProfile newUser) {
	Elements element = doc.select("div.info ul li");
	for(Element ele:element) {
		String string = ele.text();
		if(string.indexOf("Contribution")>=0) {
			newUser.contributions=string.split(":")[1];
		}
	}
	
}

private void fillTheSixFields(Document doc, LeetCodeProfile newUser) {
	Elements footerSoved = doc.select("div._UserActivityFrame_footer div._UserActivityFrame_countersRow");
	for(Element x:footerSoved) {
		Elements inner = x.select("div._UserActivityFrame_counter");
		for(Element ele:inner) {
			String curr_desc = ele.child(1).text();
			if(curr_desc.equals("solved for all time")) {
				newUser.solvedForAllTime = ele.child(0).html();
			}else if(curr_desc.equals("solved for the last year")) {
				newUser.solvedForLastYear = ele.child(0).html();
			}else if(curr_desc.equals("solved for the last month")) {
				newUser.solvedForLastMonth = ele.child(0).html();
			}else if(curr_desc.equals("in a row max.")) {
				newUser.inARowMax = ele.child(0).html();
			}else if(curr_desc.equals("in a row for the last year")) {
				newUser.inARowLastYear = ele.child(0).html();
			}else if(curr_desc.equals("in a row for the last month")) {
				newUser.inARowLastMonth = ele.child(0).html();
			}
			//System.out.println(ele.child(0).html()+" : "+ele.child(1).html());
		}
	}
	
	
	
	
	
}

private String getRanking(Document doc) {
	Elements element = doc.select("div.user-rank span");
	return element.html();
}

private String getContestRating(Document doc) {
	
	Elements element = doc.select("div.info ul li");
	System.out.println(element.size());
	Element firstListItem = element.get(0);
	String firstListItemText = firstListItem.text();
	if(firstListItemText.indexOf("Contest rating")>=0) {
		return firstListItemText;
	}
	return "No Rating";
}

private Document documentProvider(String user) throws IOException {
	Document doc = Jsoup.connect("https://codeforces.com/profile/"+user).get();
	return doc;
}

}
