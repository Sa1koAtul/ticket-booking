package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashedpassword;
    private List<Ticket> ticketbooked;
    private String userId;
}
