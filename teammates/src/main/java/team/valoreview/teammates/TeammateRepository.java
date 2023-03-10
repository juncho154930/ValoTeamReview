package team.valoreview.teammates;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeammateRepository extends MongoRepository<Teammate, ObjectId> {
    
    Optional<Teammate> findTeammateByName(String name);

}
