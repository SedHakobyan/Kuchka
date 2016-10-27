
import java.io.IOException;
import java.nio.charset.Charset;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.*;
import java.io.*;

public class BetSure {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		

		Connection connect=Jsoup.connect("https://www.betfair.com/exchange/football"); 
		connect.proxy("er-tmg003.bee.armentel.local",8080);
		connect.timeout(40000);
		Document doc = connect.get();
		 String kot="|";
		Elements links =doc.getElementsByTag("div");
	  //Element por= links.get(0);
	//Elements meta= por.getElementsByAttribute("content");
	//System.out.println(meta.size());
	 //getElementsByAttribute("lang")
	 for (Element link:links)
		 {
		 if (link.hasAttr("id") && (link.attr("id").equals("coupon-container")))
			kot=kot+"|"+ link.attr("id");
			// System.out.println(link.attr("id"));
		 
	 }
	 //System.out.println(por.attr("content"));
	 System.out.println("skiz");
	 System.out.println(kot);
	}

}
