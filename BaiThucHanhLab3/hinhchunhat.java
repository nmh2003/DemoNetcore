package Demo.BaiThucHanhLab3;

public class hinhchunhat {
    float d;
    float r;
    float cv;
    float dt;
    void nhapchisohinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("chiều dài:");
        d = sc.nextFloat();
        System.out.println("chiều rộng:");
        r = sc.nextFloat();
    

    }
    int tinhcv (){
        cv= (d+r)*2;
        return 0;

    }
    void inchuvihinh(){
        System.out.println("chu vi:"+cv);
    }
    int tinhdientich(){
        dt=d*r;
        return 0;
    }
    void indientich(){
        System.out.println("diện tích:"+dt);
    }
    

   

}
}
