public class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp){
        this.hTemp = hTemp;
    }

    public int getHighTemp(){
        return hTemp;
    }

    public boolean sameTemp(HighTemp ht2){
        return this.hTemp == ht2.hTemp;
    }

    public boolean lessThanTemp(HighTemp ht2){
        return this.hTemp < ht2.hTemp;
    }
}
