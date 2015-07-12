package com.github.player1537.reddit;

import java.io.IOException;

import java.util.Map;

public class App {
	public static void main(String... args) throws IOException {
		Configuration configuration = Configuration.getInstance();

		for (String key : configuration.stringPropertyNames()) {
			System.out.println(String.format("%s = %s",
			                                 key,
			                                 configuration.getProperty(key)));
		}

		String json = "{\"gilded\":0,\"author_flair_text\":\"Male\",\"author_flair_css_class\":\"male\",\"retrieved_on\":1425124228,\"ups\":3,\"subreddit_id\":\"t5_2s30g\",\"edited\":false,\"controversiality\":0,\"parent_id\":\"t1_cnapn0k\",\"subreddit\":\"AskMen\",\"body\":\"I can't agree with passing the blame, but I'm glad to hear it's at least helping you with the anxiety. I went the other direction and started taking responsibility for everything. I had to realize that people make mistakes including myself and it's gonna be alright. I don't have to be shackled to my mistakes and I don't have to be afraid of making them. \",\"created_utc\":\"1420070668\",\"downs\":0,\"score\":3,\"author\":\"TheDukeofEtown\",\"archived\":false,\"distinguished\":null,\"id\":\"cnasd6x\",\"score_hidden\":false,\"name\":\"t1_cnasd6x\",\"link_id\":\"t3_2qyhmp\"}";

		RedditComment comment = new RedditComment(json);
		for (Map.Entry<String, Object> entry : comment.getData().entrySet()) {
			System.out.println(String.format("comment[%s] = %s",
			                                 entry.getKey(),
			                                 entry.getValue()));
		}

	}
}
