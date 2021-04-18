package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import service.FirstService;

import javax.validation.Valid;

public class TechniqueTestController implements TechniqueTest {

    private FirstService firstService;

    @Autowired
    public TechniqueTestController(FirstService firstService) {
        this.firstService = firstService;
    }

    @Override
    public ResponseEntity splitLisOfPerson(@Valid PersonDto personDto) {

        firstService.split(personDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Done");
    }

}
