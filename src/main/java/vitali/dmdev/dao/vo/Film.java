package vitali.dmdev.dao.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Film {
    private int filmId;
    private String title;
    private String description;
    private int releaseYear;
    private int rentalDuration;
    private double rate;
    private int length;

}
