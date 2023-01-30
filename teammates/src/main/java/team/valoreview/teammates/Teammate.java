package team.valoreview.teammates;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teammate {
    
    @Id
    private ObjectId id;

    private String name;
    private String rank;
    private String trackergg;

    @DocumentReference
    private List<Review> reviewIds;




}
