public class Newjava {

    private String name; //이름
    private int age; //나이
    private String myaddr; //주소
    private int height; //키


    Newjava(String n, int a, String m, int h) {
        name = n;
        age = a;
        myaddr = m;
        height = h;
    }

    String getName() {
        return name;
    } //이름 가져오기

    int getAge() {
        return age;
    } // 나이 가져오기

    String getMyaddr() {
        return myaddr;
    } //주소 가져오기

    int getHeight() {
        return height;
    } //키 가져오기

    void addAge(int a) {
        age += a;
    }//나이 추가

    void addHeight(int h) {
        height += h;
    } // 키 증가

}

class KaKaoFriends {
    public static void main(String[] args) {
        Newjava apech = new Newjava("어피치", 12, "판교", 150);
        Newjava crong = new Newjava("크롱", 13, "평택", 155);

        //어피치 2살 증가
        apech.addAge(2);
        //크롱 키 10cm 자람
        crong.addHeight(10);

        System.out.println("이름 : " + apech.getName());
        System.out.println("나이 : " + apech.getAge());
        System.out.println("주소 : " + apech.getMyaddr());
        System.out.println("키 :" + apech.getHeight());
        System.out.println();
        System.out.println("이름 : " + crong.getName());
        System.out.println("나이 : " + crong.getAge());
        System.out.println("주소 : " + crong.getMyaddr());
        System.out.println("키 :" + crong.getHeight());
    }
}