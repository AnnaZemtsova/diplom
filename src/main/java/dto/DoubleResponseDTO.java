package dto;

public class DoubleResponseDTO {

    private double data;

    public DoubleResponseDTO(double data) {
        this.data = data;
    }

    public DoubleResponseDTO() {
    }

    public double getStr() {
        return data;
    }

    public void setStr(double data) {
        this.data = data;
    }
}
