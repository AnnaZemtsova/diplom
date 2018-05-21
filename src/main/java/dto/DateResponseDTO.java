package dto;

import java.util.Date;

public class DateResponseDTO {
    private Date date;

    public DateResponseDTO(){}
    public DateResponseDTO(Date date) {
        this.date = date;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
