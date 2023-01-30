package team.valoreview.teammates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeammateService {
    
    @Autowired
    private TeammateRepository teammateRepository;

    public List<Teammate> allTeammates() {
        return teammateRepository.findAll();
    }
}
