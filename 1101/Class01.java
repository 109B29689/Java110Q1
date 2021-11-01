class Cal_area{
    int r;
    int l;
    int w;
    int h;
    void Spherevolume(int radius){
        r=radius;
        System.out.printf("%.1f\n",r*r*r*3.14159*4/3);
    }
    void Rectangularvolume(int length,int width,int height){
        l=length;
        w=width;
        h=height;
        System.out.println((l*w+w*h+l*h)*2); 
    }
}
public class Class01 {

    public static void main(String[] args) {
        Cal_area ca=new Cal_area();
        ca.Spherevolume(10);
        ca.Rectangularvolume(4, 5, 6);
    }
}
