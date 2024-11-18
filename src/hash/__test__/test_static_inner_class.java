package hash.__test__;

public class test_static_inner_class {
    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

    }


    // 设置成static可以避免重复创建，但又可以为这个类提供辅助。
    static class test{
        int id;
        int name;

        void method(){
            System.out.println("nothing.");
        }
    }
}
