class Data{
  private String name;
  private Test score;
  class Test{
    private int math;
    private int english;
    public Test(int eng,int m){
      english=eng;
      math=m;
    }
    public double avg(){
      double avg=(english+math)/2.0;
      return avg;
    }
  }
  public Data(String n,int eng,int m){
    name=n;
    score=new Test(eng,m);
  }
  public void show(){
    System.out.println("name:"+name+" english:"+score.english+" math:"+score.math+" avg:"+score.avg());
  }
}
class Class03 {  
  public static void main(String args[]) { 
     Data[] da=new Data[2];
     da[0]=new Data("Annie",85,92);
     da[1]=new Data("Brian",77,56);
     da[0].show();
    da[1].show();
  } 
}

/*output--------------------------------
name:Annie english:85 math:92 avg:88.5
name:Brian english:77 math:56 avg:66.5
--------------------------------------*/
