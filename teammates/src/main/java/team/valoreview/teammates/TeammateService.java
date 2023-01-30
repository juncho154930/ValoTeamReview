package team.valoreview.teammates;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeammateService {
    
    @Autowired
    private TeammateRepository teammateRepository;

    public List<Teammate> allTeammates() {
        return teammateRepository.findAll();
    }

    public Optional<Teammate> singleTeammate(String name) {
        return teammateRepository.findTeammateByName(name);
    }

}
