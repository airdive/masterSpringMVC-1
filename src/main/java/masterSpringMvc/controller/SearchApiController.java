package masterSpringMvc.controller;

import masterSpringMvc.search.LightTweet;
import masterSpringMvc.search.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchParameters;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchApiController {
    private SearchService searchService;

    @Autowired
    public SearchApiController(SearchService searchService){
        this.searchService = searchService;
    }

    @RequestMapping(value = "/{searchType}", method = RequestMethod.GET)
    public List<LightTweet> search(@PathVariable String searchType,
                                   @MatrixVariable List<String> keywords) {

        List<SearchParameters> searches = keywords.stream()
                .map(teste -> cre)
        return searchService.searchs().stream()
                .map(params -> twitter.searchOperations());
    }
}
