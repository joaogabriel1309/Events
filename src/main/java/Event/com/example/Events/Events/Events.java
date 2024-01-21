package Event.com.example.Events.Events;

import jakarta.persistence.*;

@Table(name = "Events")
@Entity(name = "Events")
public class Events {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String image;
}
