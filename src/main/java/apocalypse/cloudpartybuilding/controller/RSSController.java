package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.service.RSSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//返回的数据都是json
@RequestMapping("/RSS")
public class RSSController {
    @Autowired
    RSSService rssService;
    @RequestMapping(value="/communistPartyRSS" ,method = RequestMethod.GET)
    public List communistPartyRSS() {
        return rssService.communistPartyRSS();
    }
    @RequestMapping(value="/peopleNewRSS" ,method = RequestMethod.GET)
    public List peopleNewRSS() {
        return rssService.peopleNewRSS();
    }
}
