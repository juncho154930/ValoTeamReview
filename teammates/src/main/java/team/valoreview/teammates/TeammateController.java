package team.valoreview.teammates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teammates")
public class TeammateController {

    @Autowired
    private TeammateService teammateService;

    @GetMapping
    public ResponseEntity<List<Teammate>> getAllTeammates() {
        return new ResponseEntity<List<Teammate>>(teammateService.allTeammates(), HttpStatus.OK);
    }

}
