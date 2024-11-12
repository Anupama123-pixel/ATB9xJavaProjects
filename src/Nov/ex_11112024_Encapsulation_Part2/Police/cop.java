package Nov.ex_11112024_Encapsulation_Part2.Police;

public class cop {
    private int gun;
    public String iCard;

    public cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }


}
