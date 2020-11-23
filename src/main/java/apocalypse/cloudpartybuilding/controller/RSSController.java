package apocalypse.cloudpartybuilding.controller;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.List;

@RestController//返回的数据都是json
@RequestMapping("/RSS")
public class RSSController {
    @RequestMapping(value="/communistPartyRSS" ,method = RequestMethod.GET)
    public List communistPartyRSS() {
        String communistPartyRss = "http://www.people.com.cn/rss/theory.xml";//xx网
        List entries = null;
            try {
                URL url = new URL(communistPartyRss);
                // 读取Rss源
                XmlReader reader = new XmlReader(url);
                SyndFeedInput input = new SyndFeedInput();
                // 得到SyndFeed对象，即得到Rss源里的所有信息
                SyndFeed feed = input.build(reader);
                // 得到Rss新闻中子项列表
                 entries = feed.getEntries();
                // 循环得到每个子项信息
                return entries;
            } catch (Exception e) {
                e.printStackTrace();
                return entries;
            }
            
    }
    @RequestMapping(value="/peopleNewRSS" ,method = RequestMethod.GET)
    public List peopleNewRSS() {
        String peopleRss = "http://www.people.com.cn/rss/politics.xml";//xx网
        List entries = null;
        try {
            URL url = new URL(peopleRss);
            // 读取Rss源
            XmlReader reader = new XmlReader(url);
            SyndFeedInput input = new SyndFeedInput();
            // 得到SyndFeed对象，即得到Rss源里的所有信息
            SyndFeed feed = input.build(reader);
            // 得到Rss新闻中子项列表
            entries = feed.getEntries();
            // 循环得到每个子项信息
            return entries;
        } catch (Exception e) {
            e.printStackTrace();
            return entries;
        }

    }
}
