package ca.ualberta.cs.lonelytwitterrefactor;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends Tweet {

	public NormalLonelyTweet() {

	}

	public NormalLonelyTweet(String text, Date date) {
		super(text, date);
	}

}