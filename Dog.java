//第三章练习五、六

public class Dog {
    String name;
    String says;

    public static void main(String args[]){
        Dog dog1 =new Dog();
        Dog dog2=new Dog();
        dog1.name="spot";
        dog2.name="scruffy";
        dog1.says = "Ruff";
        dog2.says="Wurf";
        System.out.println(dog1.says);
        System.out.println(dog2.says);

        Dog dog3 = dog1;
        System.out.println("equals:"+dog1.equals(dog3));
        System.out.println("==:"+(dog1==dog3));
        System.out.println(dog1.says==dog3.says);

    }

}
