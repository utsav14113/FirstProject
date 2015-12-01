import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Page;
import com.restfb.types.User;

public class Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accesstoken="CAACEdEose0cBAIpF2wGU9jLLLQoMcTF5aZBa7xJ6jttpdTiYqm8TBMK84zoV349xRUmyFVlG5NDZBUawjZCkYbQ4PE19k0AX7grIpZAJhA38DaItZA0qzI3cHSJdRUNtb753vDEPEo7CZC4Wc3EAL5UiZC3bBs30QDKEZCF5h3KeO3PPNvA0x5xESiR7Ix3vVfamjuZBgXgdcOrKRUQCQBsza";
		@SuppressWarnings("deprecation")
		FacebookClient fbclient=new DefaultFacebookClient(accesstoken);
		User user=fbclient.fetchObject("me",User.class);
		Page page=fbclient.fetchObject("cocacola",Page.class);
		System.out.println("Testing Change");
		System.out.println("User name:"+user.getName());
		System.out.println("Education:"+user.getEducation()+user.getFirstName());
		
	}

}
