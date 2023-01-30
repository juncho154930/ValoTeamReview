package team.valoreview.teammates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String name) {
        Review review = reviewRepository.insert(new Review(reviewBody));
        
        mongoTemplate.update(Teammate.class)
            .matching(Criteria.where("name").is(name))
            .apply(new Update().push("reviewIds", review))
            .first();

        return review;
    }

}
