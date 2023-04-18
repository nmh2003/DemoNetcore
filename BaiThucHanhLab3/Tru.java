package Demo.BaiThucHanhLab3;

public class Tru {
    public float chieuCao;
    Scanner scanner=new Scanner(System.in);
    public void Tru(){
        name="hình trụ";
    }
    public void NhapChieuCao(){
        NhapBanKinh();
        System.out.println("Chiều cao h: ");
        chieuCao=scanner.nextFloat();
    }
    public void TinhTheTich(){
        TinhDienTich();
        theTich=dienTich*chieuCao;
    }

}
}
