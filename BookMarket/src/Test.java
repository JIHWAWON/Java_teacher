import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Test {

	public static void main(String[] args) throws IOException {
		Document document = Jsoup.connect("https://m.search.naver.com/search.naver?sm=mtp_hty.top&where=m&query=미국환율").get();
		
	//	System.out.println(document);
		Elements el = document.getElementsByAttributeValue("class", "nb_txt _sub_price");
		System.out.println(el.get(0).text());
		System.out.println(el.get(1).text());
		
	}

}
