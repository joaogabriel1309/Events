package Event.com.example.Events.Controller;

import Event.com.example.Events.Events.Events;
import Event.com.example.Events.Events.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Events")
public class EventsControlle {
    @Autowired
    private EventsRepository repository;

    @GetMapping
    public List<Events> getAll(){
        List<Events> eventsList = repository.findAll();
        return eventsList;
    }
}
