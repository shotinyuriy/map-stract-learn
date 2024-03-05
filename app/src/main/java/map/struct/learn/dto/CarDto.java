package map.struct.learn.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class CarDto {
    private String manufacturer;
    private int seatCount;
    private PersonDto owner;
}
