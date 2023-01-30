package team.valoreview.teammates;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeammateRepository extends MongoRepository<Teammate, ObjectId> {
    
}
