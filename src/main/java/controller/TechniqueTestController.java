package controller;

import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public class TechniqueTestController implements TechniqueTest {
    @Override
    public ResponseEntity splitLisOfPerson(@Valid PersonDto personDto) {
        return null;
    }

}
