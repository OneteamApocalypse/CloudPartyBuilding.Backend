package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.service.RSSService;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import org.springframework.stereotype.Service;
import java.net.URL;
import java.util.List;
@Service
public class RSSServiceImpl implements RSSService {
    @Override
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
    @Override
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
