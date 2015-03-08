package de.egga.persons;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author egga
 */
@RestController
public class PersonController {

    public static final String COLLECTION_URL = "/api/persons/";
    public static final String ITEM_URL = COLLECTION_URL + "{personId}";

    private ConcurrentHashMap<String, Person> repository = new ConcurrentHashMap<>();

    @RequestMapping(value = COLLECTION_URL, method = GET, produces = APPLICATION_JSON_VALUE)
    Collection<Person> getPersons() {
        return repository.values();
    }

    @RequestMapping(value = ITEM_URL, method = GET, produces = APPLICATION_JSON_VALUE)
    Person getPerson(@PathVariable String personId) {
        return repository.get(personId);
    }

    @RequestMapping(value = ITEM_URL, method = PUT, consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(NO_CONTENT)
    void addPerson(@PathVariable String personId, @RequestBody Person person) {
        repository.put(personId, person);
    }

    @RequestMapping(value = ITEM_URL, method = DELETE)
    @ResponseStatus(NO_CONTENT)
    public void deleteProjectKey(@PathVariable String personId) {
        repository.remove(personId);
    }
}
