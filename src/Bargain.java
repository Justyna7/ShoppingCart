public class Bargain extends Special_offer {
    private final double min;
    private final double percent;
    public Bargain(double requirement, double percent){
        this.min = requirement;
        this.percent = percent;
    }
    @Override
    public boolean check_if_applies() {
        return false;
    }

    @Override
    public void apply_offer() {

    }
}
