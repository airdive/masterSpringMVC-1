package masterSpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TweetController {

    @Autowired
    private Twitter twitter;

    @RequestMapping("/")
    public String Hello(@RequestParam(defaultValue = "masteringSpringMVC4") String search, Model model){

        SearchResults searchResults = twitter.searchOperations().search(search);

        if(0 == searchResults.getTweets().size()){
            model.addAttribute("message", "No tweets found...");
            return "resultPage";
        }

        String text = searchResults.getTweets().get(0).getText();

        model.addAttribute("message", text);
        return "resultPage";
    }
}
