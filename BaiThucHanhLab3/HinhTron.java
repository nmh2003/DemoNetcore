package Demo.BaiThucHanhLab3;

public class HinhTron {
    Scanner sc = new Scanner(System.in);
    final float pi = 3.14f ;
    float r;
    float chuvi=0;
    float dientich = 0;
    
    
     void  nhapbankinh() {
        System.out.println("nhap ban kinh");
        r= sc.nextFloat();
        
    } void tinhchuvi (){
        chuvi= chuvi+2*pi*r;
         
    }
    void inchuvi(){
        System.out.println("chu vi la"+ chuvi);
    }
     void tinhdientich()
    {
        dientich= dientich + 2*pi*(r*r);
        
    }
    void indientich(){
        System.out.println(" dien tich la "+ dientich);
    }
}
