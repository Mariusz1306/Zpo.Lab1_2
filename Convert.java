public class Convert {
    private Integer number;

    public Convert(int liczba) {
        this.number = liczba;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public int toDecimal(){
        int converted_value = Integer.parseInt(number.toString());
        return converted_value;
    }
}
