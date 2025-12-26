package ge.mziuri.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@AllArgsConstructor
@Data
public class BookingResponse {
    Long id;
    Long clientId;
    Long coachId;
    Long timeslotId;
    String status;
    Instant createdAt;
}
