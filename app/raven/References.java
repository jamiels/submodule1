package raven;

public final class References {
	
	
	public static String		BRAINTREE_MERCHANTID 		= "vvdmz7bpxzvyg7yh";
	public static String		BRAINTREE_PUBLICKEY			= "ztzt9vhcx4c46ffm";
	public static String		BRAINTREE_PRIVATEKEY		= "9fd71a6f19efbfafb044f67e3ba7d023";
	
	// Acme config
	public static String 		LISTINGS_ACME_URL  			= "http://feeds.acmelistings.com/feeds/jamiel.php";
	public static int			LISTINGS_ACME_URL_TIMEOUT 	= 300000;	
	
	// AWS Access
	public static String 		S3_ACCESS_KEY  				= "AKIAI4Z4TCUVW7K4VFSA";
	public static String 		S3_SECRET_KEY     			= "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";	
	
	// S3 Files
	public static final String 	PADWOW_BUCKET 				= "padwow";
	public static final String 	PADWOW_SYNDICATION_BUCKET 	= "padwow-syndication";
	
	public static final String 	OUTPUT_BUILDINGS 			= "output/buildings.csv";
	public static final String 	OUTPUT_NEIGHBORHOOD 		= "output/neighborhood.csv";
	public static String 		LISTINGS_ACME_FILE 			= "listings/Acme_Listings.xml.txt";
	public static String 		LISTINGS_ALL_FILE	 		= "output/Full_Listings_Dump.xml.txt";
	
	public static String 		STREETEASY_NOFEE_MANAHATTAN_URL = "http://streeteasy.com/for-rent/manhattan/no_fee:1?view=list";
	
	
	// Templates
	public static String 		TEMPLATE_TRULIA 			= "templates/trulia/property.xml";
	public static String 		TEMPLATE_TRULIA_PICTURE 	= "templates/trulia/picture.xml";
	
	// SYNDICATION Output FILE NAMES
	public static String 		SYNDICATION_FILENAME_PADMAPPER = "PadMapper.Syndication.Trulia.xml.txt";
		
	
	// webhook keys - keys we've given to padmapper to call our webhook
	public static final String 	WEBHOOK_KEY_PADMAPPER 		= "46s8895L65cD0Hu1lDh9r0hV2ws2KVd4";
	
	// sendgrid
	public static final String 	SENDGRID_API_KEY_PADWOW_SENDER = "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";	
	public static final String 	SENDGRID_TRANSACTIONAL_TEAM_INTRO = "ca935fe9-b9f7-4648-9fad-ac95b4c994fb";
	public static final String 	SENDGRID_TRANSACTIONAL_STILL_LOOKING = "d8d0bdf5-b982-4c2b-a5cb-9ad4a49fa53d";
	
	
	// bitly
	public static final String 	BITLY_API_KEY = "c3b2afb1d308648d5d2b8a23b9602f14aa82d2cb";
	
	// slack channels 
	public static final String 	SLACK_CHANNEL_URL_TWITTER 	= "https://hooks.slack.com/services/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";
	public static final String 	SLACK_CHANNEL_URL_ACTIVITY 	= "https://hooks.slack.com/services/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";
	public static final String	SLACK_CHANNEL_URL_LEADS		= "https://hooks.slack.com/services/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";
	public static final String 	SLACK_CHANNEL_URL_FSBO		= "https://hooks.slack.com/services/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";
	public static final String 	SLACK_CHANNEL_URL_DELEGATION = "https://hooks.slack.com/services/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";
	public static final String	SLACK_CHANNEL_URL_SHOW		= "https://hooks.slack.com/services/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";
	public static final String	SLACK_CHANNEL_URL_INBOX		=  "https://hooks.slack.com/services/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";
	public static final String	SLACK_CHANNEL_URL_HYPERACTIVITY	=  "https://hooks.slack.com/services/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";
	
	public static final int 	SLACK_CHANNEL_POST_TIMEOUT 	= 30000;
	
	// Twitter
	
	public static final String	TWITTER_CONSUMER_KEY		= "hOgdZ5PWccGkTuFMoVs3ks5aq";
	public static final String	TWITTER_CONSUMER_SECRET		= "tuz0QEIoLmLH2XjKacPylR0SMbpsU6i2kMWrMnlnqC7Zh3lYn4";
	public static final String	TWITTER_ACCESS_TOKEN		= "3427129785-LenChE5naV6p77WtwlC5Ftt4C3vax9f3SqQO0NG";
	public static final String	TWITTER_ACCESS_SECRET		= "0wg3Jq6X6sM3GTr50MDH7SeoGciE6Y8VxuG0PnJyFPOTF";
	
	
	//
	public static final String	ADMIN_USER_PROFILE_URL_BLANK	= "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg";
	
}
