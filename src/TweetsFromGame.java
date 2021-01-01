import java.util.List;
import java.util.Map;

import twitter4j.IDs;
import twitter4j.Paging;
import twitter4j.RateLimitStatus;
import twitter4j.RateLimitStatusEvent;
import twitter4j.RateLimitStatusListener;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;

public class TweetsFromGame {

	public TweetsFromGame() throws TwitterException{
	Twitter unauthenticatedTwitter = new TwitterFactory().getInstance();
	//First param of Paging() is the page number, second is the number per page (this is capped around 200 I think.
	Paging paging = new Paging(1);
	//List<Status> statuses = unauthenticatedTwitter.getUserTimeline("google",paging);
	List<Status> statuses = unauthenticatedTwitter.getUserTimeline("google",paging);
	
	for (Status status : statuses) {
        System.out.println(status.getUser().getName() + ":" +
                           status.getText() + " Retweet Count: "+ status.getRetweetCount());
    }
	}
	
	public static void main (String [] args) throws TwitterException, InterruptedException{
		TweetsFromGame t = new TweetsFromGame();
	}
}
