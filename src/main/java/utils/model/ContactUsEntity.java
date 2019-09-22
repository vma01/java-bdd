package utils.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ContactUsEntity {
    public List<String> firstName;
    public String lastName;
}
