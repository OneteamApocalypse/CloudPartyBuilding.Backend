package apocalypse.cloudpartybuilding.util;


import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CommunistPartyRSS {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        String communistPartyRss = "http://www.people.com.cn/rss/theory.xml";//xx网
        List<String> list = new ArrayList<String>();
        list.add(communistPartyRss);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            try {
                URL url = new URL(list.get(i));
                // 读取Rss源
                XmlReader reader = new XmlReader(url);
                System.out.println("Rss源的编码格式为：" + reader.getEncoding());
                SyndFeedInput input = new SyndFeedInput();
                // 得到SyndFeed对象，即得到Rss源里的所有信息
                SyndFeed feed = input.build(reader);
                //System.out.println(feed);
                // 得到Rss新闻中子项列表
                List entries = feed.getEntries();
                // 循环得到每个子项信息
                int j = 0;
                for (; j <= entries.size()-1; j++) {
                    SyndEntry entry = (SyndEntry) entries.get(j);
                    SyndContent description = entry.getDescription();
                    System.err.println("====================");
                    System.err.println("SyndEntry对象：");
                    System.err.println(entry.toString());
                    System.err.println("SyndContent对象：");
                    System.err.println(description.toString());

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
