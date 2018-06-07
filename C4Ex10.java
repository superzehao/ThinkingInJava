
//吸血鬼数字

import org.junit.Test;

import java.util.ArrayList;

public class C4Ex10 {

    @Test
    public void test(){
        int a,b,ashi,age,bshi,bge;
        int count=0;
        ArrayList<Integer> resultList = new ArrayList<>();

        for(a=10;a<=99;a++){
            for(b=10;a<=99;b++){
                ashi = a/10;
                age=a%10;
                bshi=b/10;
                bge=b%10;

                if((a*b)==(ashi*1000+age*100+bshi*10+bge)||(a*b)==(ashi*1000+bshi+100+age*10+bge)||(a*b)==(ashi*1000+age*100+bge*10+bshi)){
                    resultList.add(a*b);
                }
            }
        }
        for(int i=0;i<=resultList.size();i++) {
            System.out.println(resultList.get(i));
        }
    }



    public static void main(String args[]){

//        int a,b,ashi,age,bshi,bge;
//        int count=0;
//        ArrayList<Integer> resultList = new ArrayList<>();
//
//        for(a=10;a<=99;a++){
//            for(b=10;a<=99;b++){
//                ashi = a/10;
//                age=a%10;
//                bshi=b/10;
//                bge=b%10;
//
//                if((a*b)==(ashi*1000+age*100+bshi*10+bge)||(a*b)==(ashi*1000+bshi+100+age*10+bge)||(a*b)==(ashi*1000+age*100+bge*10+bshi)){
//                    resultList.add(a*b);
//                }
//            }
//        }
//        for(int i=0;i<=resultList.size();i++) {
//            System.out.println(resultList.get(i));
//        }
    }
}
