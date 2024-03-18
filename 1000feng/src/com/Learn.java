package com;//public class learn {
//    public static void main(String[] args){
//        boolean isPass = true;
//        if (isPass ) {
//            System.out.println("考试通过，恭喜");
//        }else {
//            System.out.println("考试没有通过，下次努力");
//        }
//        byte b1=10;
//        int  c1=b1;
//    int n1;
//    n1=13;
//    int n2;
//    n2=17;
//    int n3;
//    n3=n1+n2;
//    System.out.println("n3 = " + n3);
//    int n4=38;
//    int n5=n4-n3;
//    System.out.println("n5 = " + n5);
//    String name = "jack";
//    int age =20;
//    double score=80.9;
//    char gender = '男';
//    String hobby = "打篮球";
//    System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"+name+"\t"+age+"\t"+score+"\t"+gender+"\t"+hobby);
//    int i=1;
//    i=++i;
//    System.out.println(i);

    //Input输入
    //演示接收用户的输入
    //引入Scanner类所在的包   import java.util.Scanner;


//    Scanner myScanner=new Scanner (System.in);
//    String name=myScanner.next();
//    //System.out.println(name);
//    int age=myScanner.nextInt();
//   // System.out.println(age);
//    double sal=myScanner.nextDouble();
// System.out.println("name"+name+" age= "+age+" sal= "+sal);


//       int a=2;
//       switch (a){
//           case 2:
//               a++;
//           case 3:
//               a=+2;
//           case 5:
//               a=2;
//       }
//       System.out.println(a);
//        for(int i=1;i<10;i++){
//            System.out.println(i);
//        }
//    }
//}

//public class learn {
//    public static void main(String[] args) {
//        int[] arr = {4, -1, 9, 10, 23};
//        int max;
//        int maxIndex = 0;
//        max = arr[0];
//        for (int i = 1; i < 5; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                maxIndex = i;
//            }
//        }
//        System.out.println("max= " + max + "  maxIndex=  " + maxIndex);
//    }
//}

//public class learn{
//    public static void main(String[] args){
////       String[] name={"小张","小王","小李","小兰"};
//////        Scanner myScanner=new Scanner(System.in);
//////        System.out.println("请输入名字");
//////        String find name=myScanner.next();
//////        int index=-1;
//////        for(int i=0;i< name.length;i++){
//////            if(find name.equals(name[i])) {
//////                System.out.println("恭喜你找到 " + find name);
//////                System.out.println("下标为= " + i);
//////                index = i;
//////                break;
//////
//////            }
//////        }
//////        if(index==-1){
//////            System.out.println("sorry ,没有找到"+find name);
//////        }
//
//
//    }
//}

@SuppressWarnings("all")
//JAVA 的输入函数
//Scanner scanner = new Scanner(System.in);
//int x= scanner.nextInt();


public class Learn{
    public static void main(String[] args){

    for (int i = 0; i <50 ; i++) {
        System.out.println("有一个数字 "+i+"  "+"哈哈哈");
    }

















        //打印地图
       /*int[][] map=new int [8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i]=1;
            map[7][i]=1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][0]=1;
            map[i][6]=1;
        }
        map[3][1]=1;
        map[3][2]=1;

        System.out.println("========当前地图情况========");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(" "+map[i][j]+"  ");
            }
            System.out.println();

        }*/
    }

}



class B{




    /* public boolean findway(int[][] map,int i,int j){
       if(map[6][5]==2){
           return true;
       }else {
           if(map[i][j]==0){

           }
       }
        return true;
    }*/
//    public void test200(Person p){
//        p=null;
//    }
//    public int factorial(int n){
//        if(n==1){
//            return 1;
//        }else{
//            return factorial(n-1)*n;
//        }
//    }

    //斐波那契
    public int fibonacci(int n){
        if(n>=1){
            if(n==1||n==2){
                return 1;
            }
            else {
                return fibonacci(n-1)+fibonacci(n-2);
            }
        }else {
            System.out.println("要求输入的n>=1的整数");
            return -1;
        }
    }

    //猴子桃子
    public int peach(int day){
        if(day==10){
            return 1;
        }else if(day>=1&&day<=9){
            return (peach(day+1)+1)*2;
        }else {
            System.out.println("day在1-10");
            return -1;
        }
    }
}

class Person{
    String name;
    int age;
}
